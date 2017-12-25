package cn.rzpt.controller;

import cn.rzpt.entity.Plan;
import cn.rzpt.entity.User;
import cn.rzpt.service.PlanService;
import cn.rzpt.service.ProfessionService;
import cn.rzpt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/plan")
public class PlanController {
    private ArrayList list;
    @Autowired
    private User user;
    @Autowired
    private Plan plan;

    @Autowired
    private UserService userService;
    @Autowired
    private ProfessionService professionService;
    @Autowired
    private PlanService planService;
    private String msg;

    /*
     *
     * */
    /*@RequestMapping(value = "/allPro_list")
    private String allPro_list(Model model){

    }*/
    /*
     *   获得所有方案的年度
     * */
    @RequestMapping(value = "/allYear_list")
    private String allYear_list(Model model) {
        list = planService.getPlanYears();
        model.addAttribute("years", list);
        return "plan/allYear_list";
    }

    /*
     *   超管通过年度查看方案列表
     * */

    @RequestMapping(value = "/allPlan_listByYear/{year}")
    private String allPlan_listByYear(Model model, @PathVariable("year") int year) {
        list = planService.getPlanByYear(year);
        model.addAttribute("plans", list);
        model.addAttribute("userState", 0);
        return "plan/plan_listByYear";
    }

    /*
     *   该方法对超管以外其他的人有效
     * */
    @RequestMapping(value = "/pro_list/{id}")
    private String pro_list(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list = professionService.getProsByDept_id(user.getDept_id());
        model.addAttribute("pros", list);
        model.addAttribute("userState", user.getState());
        return "plan/pro_list";
    }

    @RequestMapping(value = "/plan_showByPro/{id}/{userState}")
    private String plan_showByPro(Model model, @PathVariable("id") int id,
                                  @PathVariable("userState") int userState) {
        plan = planService.getPlanByPro_id(id);
        model.addAttribute("plan", plan);
        model.addAttribute("userState", userState);
        return "plan/plan_show";
    }

    /*
     *   该方法对超管以外其他的人有效
     * */
    @RequestMapping(value = "/year_list/{id}")
    private String year_list(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list = planService.getPlanYearsByDept_id(user.getDept_id());      //获得该用户的院部的所有方案的年度
        model.addAttribute("years", list);
        model.addAttribute("deptId", user.getDept_id());
        model.addAttribute("userState", user.getState());
        return "plan/year_list";
    }

    @RequestMapping(value = "/plan_listByYear/{year}/{deptId}/{userState}")
    private String plan_listByYear(Model model, @PathVariable("year") int year,
                                   @PathVariable("deptId") int deptId,
                                   @PathVariable("userState") int userState) {
        list = planService.getPlanByYearAndDept_id(year, deptId);
        model.addAttribute("plans", list);
        model.addAttribute("userState", userState);
        return "plan/plan_listByYear";
    }

    @RequestMapping(value = "/plan_showByYear/{id}/{userState}")
    private String plan_showByYear(Model model, @PathVariable("id") int id,
                                   @PathVariable("userState") int userState) {
        plan = planService.getPlanById(id);
        model.addAttribute("plan", plan);
        model.addAttribute("userState", userState);
        return "plan/plan_show";
    }

    /*
     *   该方法对超管和院部管理员以外其他的人有效
     * */
    @RequestMapping(value = "/plan_show/{id}")
    private String plan_show(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        plan = planService.getPlanByPro_id(user.getPro_id());
        model.addAttribute("plan", plan);
        model.addAttribute("userState", user.getState());
        return "plan/plan_show";
    }

    /*
     *   超管查看待审核的方案
     * */
    @RequestMapping(value = "/unCheckByAdmin/{id}")
    private String unCheckByAdmin(Model model, @PathVariable("id") int id) {
        list = planService.getPlansByState(2);
        model.addAttribute("plans", list);
        model.addAttribute("userId", id);
        return "plan/plan_unCheckByAdmin";
    }

    @RequestMapping(value = "/plan_showByAdmin/{planId}/{userId}")
    private String plan_showByAdmin(Model model, @PathVariable("planId") int planId,
                                    @PathVariable("userId") int userId) {
        //这里传入id并不直接传入state，可以在显示方案的页面后期添加审核意见
        user = userService.getUserById(userId);
        plan = planService.getPlanById(planId);
        model.addAttribute("plan", plan);
        model.addAttribute("user", user);
        model.addAttribute("userState", user.getState());
        return "plan/plan_show";
    }

    @RequestMapping(value = "/plan_toCheck/{planId}/{userId}")
    private String plan_toCheck(Model model, @PathVariable("planId") int planId,
                                @PathVariable("userId") int userId) {
        plan = planService.getPlanById(planId);
        user = userService.getUserById(userId);
        model.addAttribute("plan", plan);
        model.addAttribute("user", user);
        return "shyi/shyj_add";
    }

    @RequestMapping(value = "/plan_success/{planId}/{userState}")
    private String plan_success(Model model,@PathVariable("planId") int planId,@PathVariable("userState") int userState) {
        if (userState == 0){
            //获得方案的审核状态，如果状态是院部管理员审核成功，则能审核
            int i=planService.getStateById(planId);
            if (i==2){
                planService.updateState(planId,3);
                return "admin/success";
            }else {
                msg = "您已审核过该方案了，请不要重复审核";
                model.addAttribute("msg",msg);
                return "admin/error";
            }
        } else {

            planService.updateState(planId,2);
            return "depter/success";
        }
    }

    /*
     *   方案添加页面的显示
     *   @Param
     *   id是教研室主任的id
     * */
    @RequestMapping(value = "/plan_add1/{id}")
    private String plan_add1(Model model, @PathVariable("id") int id) {
        return "plan/plan_add";
    }
}
