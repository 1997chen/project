package cn.rzpt.controller;

import cn.rzpt.entity.User;
import cn.rzpt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/depter")
public class DepterController {
    private ArrayList list;
    @Autowired
    private User user;
    private String msg;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String depter() {
        return "depter/index";
    }

    @RequestMapping(value = "/teacher_add1/{id}", method = RequestMethod.GET)
    private String teacher_add1(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list = userService.getProsByUser_id(id);
        model.addAttribute("user", user);
        model.addAttribute("list", list);
        return "depter/teacher_add";
    }

    @RequestMapping(value = "/teacher_add2", method = RequestMethod.POST)
    private String teacher_add2(Model model, User user) {
        if(user.getPro_id()==null || user.getPwd().equals("")){
            msg = "1.检查数据是否填写完整";
            model.addAttribute("msg", msg);
            return "depter/error";
        }
        int i = userService.teacher_add2(user);
        if (i == 1) {
            return "depter/success";
        } else if (i == -1) {
            msg = "用户已存在";
            model.addAttribute("msg", msg);
            return "depter/error";
        } else {
            msg = "1.检查数据是否填写正确   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "depter/error";
        }
    }

    @RequestMapping(value = "/teacher_list/{id}")
    private String teacher_list(Model model, @PathVariable("id") int id) {
        list = userService.getTeachers(id);
        model.addAttribute("list", list);
        model.addAttribute("depterId", id);
        return "depter/teacher_list";
    }

    @RequestMapping(value = "/teacher_update1/{id}")
    private String teacher_update1(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list = userService.getProsByUser_id(id);      //获得所属院部的所有专业
        model.addAttribute("user", user);
        model.addAttribute("pros", list);
        return "depter/teacher_update";
    }

    @RequestMapping(value = "/teacher_update2")
    private String teacher_update2(Model model, User user) {
        if(user.getPwd().equals("")){
            msg = "1.您未填写密码！";
            model.addAttribute("msg", msg);
            return "depter/error";
        }
        int i = userService.updateTeacher(user);
        if (i > 0) {
            return "depter/success";
        } else {
            msg = "修改异常！";
            model.addAttribute("msg", msg);
            return "depter/error";
        }
    }

    @RequestMapping(value = "/user_delete/{id}/{depterId}")
    private String teacher_delete(Model model, @PathVariable("id") int id, @PathVariable("depterId") int depterId) {
        user = userService.getUserById(id);
        int i = userService.deleteUser(user);
        list = userService.getTeachers(depterId);
        model.addAttribute("list", list);
        if (user != null && i > 0) {
            return "depter/teacher_list";
        } else {
            msg = "删除失败！";
            return "depter/error";
        }
    }
}
