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

    /*
     *   该方法对超管以外其他的人有效
     * */
    @RequestMapping(value = "/pro_list/{id}")
    private String pro_list(Model model, @PathVariable("id") int id){
        user=userService.getUserById(id);
        list=professionService.getProsByDept_id(user.getDept_id());
        model.addAttribute("pros",list);
        model.addAttribute("userState",user.getState());
        return "plan/pro_list";
    }

    @RequestMapping(value = "/plan_showByPro/{id}/{userState}")
    private String plan_showByPro(Model model, @PathVariable("id") int id,
                                  @PathVariable("userState") int userState){
        plan=planService.getPlanByPro_id(id);
        model.addAttribute("plan",plan);
        model.addAttribute("userState",userState);
        return "plan/plan_show";
    }

    /*
    *   该方法对超管以外其他的人有效
    * */
    @RequestMapping(value = "/year_list/{id}")
    private String year_list(Model model,@PathVariable("id") int id){
        user=userService.getUserById(id);
        list=planService.getPlanYearsByDept_id(user.getDept_id());      //获得该用户的院部的所有方案的年度
        model.addAttribute("years",list);
        model.addAttribute("deptId",user.getDept_id());
        model.addAttribute("userState",user.getState());
        return "plan/year_list";
    }

    @RequestMapping(value = "/plan_listByYear/{year}/{deptId}/{userState}")
    private String plan_listByYear(Model model,@PathVariable("year") int year,
                                   @PathVariable("deptId") int deptId,
                                   @PathVariable("userState") int userState){
        list=planService.getPlanByYearAndDept_id(year,deptId);
        model.addAttribute("plans",list);
        model.addAttribute("userState",userState);
        return "plan/plan_listByYear";
    }

    @RequestMapping(value = "/plan_showByYear/{id}/{userState}")
    private String plan_showByYear(Model model, @PathVariable("id") int id,
                                   @PathVariable("userState") int userState){
        plan=planService.getPlanById(id);
        model.addAttribute("plan",plan);
        model.addAttribute("userState",userState);
        return "plan/plan_show";
    }

    /*
     *   该方法对超管和院部管理员以外其他的人有效
     * */
    @RequestMapping(value = "/plan_show/{id}")
    private String plan_show(Model model, @PathVariable("id") int id){
        user=userService.getUserById(id);
        plan=planService.getPlanByPro_id(user.getPro_id());
        model.addAttribute("plan",plan);
        model.addAttribute("userState",user.getState());
        return "plan/plan_show";
    }
}
