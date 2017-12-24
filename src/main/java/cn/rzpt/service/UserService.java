package cn.rzpt.service;

import cn.rzpt.entity.User;

import java.util.ArrayList;

public interface UserService {
    User getUserById(int id);                  //通过id获得用户
    ArrayList getProsByUser_id(int id);        //获得用户的院部的所有专业
    int teacher_add2(User user);                //院部管理员添加老师
    ArrayList getTeachers(int id);              //获取老师通过userId
    ArrayList getTeachersByDept_id(int dept_id); //通过院部获取此院部老师
    int deleteUser(User user);                  //删除user
    int updateTeacher(User user);               //院部管理员修改老师
}
