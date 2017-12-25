package cn.rzpt.controller;

import cn.rzpt.entity.Plan;
import cn.rzpt.entity.User;
import cn.rzpt.service.PlanService;
import cn.rzpt.service.ProfessionService;
import cn.rzpt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
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

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String officer() {
        return "admin/index";
    }
}
