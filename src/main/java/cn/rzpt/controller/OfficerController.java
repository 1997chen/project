package cn.rzpt.controller;

import cn.rzpt.entity.*;
import cn.rzpt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/officer")
public class OfficerController {
    private ArrayList list1, list2;
    @Autowired
    private User user;
    @Autowired
    private Profession profession;
    @Autowired
    private Class1 class1;
    @Autowired
    private Plan plan;
    @Autowired
    private Course course;
    private String msg;
    @Autowired
    private UserService userService;
    @Autowired
    private Class1Service class1Service;
    @Autowired
    private ProfessionService professionService;
    @Autowired
    private PlanService planService;
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String officer() {
        return "officer/index";
    }

    @RequestMapping(value = "/class_add1/{id}")
    private String class1_add1(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list1 = userService.getTeachers(id);
        list2 = userService.getProsByUser_id(id);
        model.addAttribute("teachers", list1);
        model.addAttribute("pros", list2);
        return "officer/class_add";
    }

    @RequestMapping(value = "/class_add2")
    private String class1_add2(Model model, Class1 class1) {
        int i = 0;
        try {
            plan = planService.getPlanByPro_id(class1.getPro_id());
            class1.setPlan_id(plan.getId());
            i = class1Service.add(class1);
        } catch (Exception e) {
            e.printStackTrace();
            msg = "1.检查添加班级的数据是否完整！  2.稍后再试或联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
        if (i > 0) {
            return "officer/success";
        } else if (i == -1) {
            msg = "班级已存在！";
            model.addAttribute("msg", msg);
            return "officer/error";
        } else {
            msg = "1.检查添加班级的数据是否正常！  2.稍后再试或联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }

    @RequestMapping(value = "/pro_list/{id}")
    private String pro_list(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list1 = professionService.getProsByDept_id(user.getDept_id());
        model.addAttribute("pros", list1);
        return "officer/pro_list";
    }

    @RequestMapping(value = "/class_list/{proId}")
    private String class_list(Model model, @PathVariable("proId") int proId) {
        list1 = class1Service.getClass1sByPro_id(proId);
        model.addAttribute("pro", proId);
        model.addAttribute("class1s", list1);
        return "officer/class_list";
    }

    @RequestMapping(value = "/class_update1/{id}/{proId}")
    private String class_update1(Model model, @PathVariable("id") int id, @PathVariable("proId") int proId) {
        class1 = class1Service.getClass1ById(id);
        profession = professionService.getProById(proId);
        list1 = userService.getTeachersByDept_id(profession.getDept_id());
        model.addAttribute("class1", class1);
        model.addAttribute("teachers", list1);
        return "officer/class_update";
    }

    @RequestMapping(value = "/class_update2")
    private String class_update2(Model model, Class1 class1) {
        int i = class1Service.updateClass1(class1);
        if (i > 0) {
            return "officer/success";
        } else {
            msg = "修改失败！1.检查是否有信息没有填写  2.检查是否存在该班级   3.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }

    @RequestMapping(value = "/class_delete/{id}/{proId}")
    private String class_delete(Model model,@PathVariable("id") int id, @PathVariable("proId") int proId){
        class1=class1Service.getClass1ById(id);
        int i=class1Service.deleteClass1(class1);
        list1 = class1Service.getClass1sByPro_id(proId);
        model.addAttribute("pro", proId);
        model.addAttribute("class1s", list1);
        if (class1!=null && i>0){
            return "officer/class_list";
        }else {
            msg = "1.检查该班级是否已被删除   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }

    @RequestMapping(value = "/course_add1/{id}")
    private String course_add1(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list1 = professionService.getProsByDept_id(user.getDept_id());
        model.addAttribute("pros", list1);
        model.addAttribute("proId", user.getPro_id());
        return "officer/course_add";
    }

    @RequestMapping(value = "/course_add2")
    private String course_add2(Model model, Course course) {
        if(course.getName().equals("") || course.getCno().equals("")){
            msg = "1.检查课程代码或课程名是否填写   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
        int i  = courseService.add(course);
        if (i > 0) {
            return "officer/success";
        } else if (i == -1) {
            msg = "该课程已存在！";
            model.addAttribute("msg", msg);
            return "officer/error";
        } else {
            msg = "1.检查课程代码或课程名是否已存在   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }

    @RequestMapping(value = "/course_list/{id}")
    private String course_list(Model model, @PathVariable("id") int id) {
        user = userService.getUserById(id);
        list1 = courseService.getCoursesByPro_id(user.getPro_id());
        model.addAttribute("courses", list1);
        model.addAttribute("userId",id);
        return "officer/course_list";
    }

    @RequestMapping(value = "/course_update1/{courseId}")
    private String course_update1(Model model, @PathVariable("courseId") int courseId) {
        course = courseService.getCourseById(courseId);
        model.addAttribute("course", course);
        return "officer/course_update";
    }

    @RequestMapping(value = "/course_update2")
    private String course_update2(Model model, Course course) {
        if(course.getName().equals("") || course.getCno().equals("")){
            msg = "1.检查课程代码或课程名是否填写   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
        int i = courseService.update(course);
        if (i > 0) {
            return "officer/success";
        } else {
            msg = "1.检查修改后的班级是否已存在   2.检查修改数据是否准确  3.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }

    @RequestMapping(value = "/course_delete/{id}/{userId}")
    private String course_delete(Model model,@PathVariable("id") int cId, @PathVariable("userId") int userId){
        course=courseService.getCourseById(cId);
        int i=courseService.delete(course);
        user = userService.getUserById(userId);
        list1 = courseService.getCoursesByPro_id(user.getPro_id());
        model.addAttribute("courses", list1);
        if (course!=null && i>0){
            return "officer/course_list";
        }else {
            msg = "1.检查该课程是否已被删除   2.联系网站管理员";
            model.addAttribute("msg", msg);
            return "officer/error";
        }
    }
}
