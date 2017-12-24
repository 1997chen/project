package cn.rzpt.service;

import cn.rzpt.entity.Course;

import java.util.ArrayList;

public interface CourseService {
    Course getCourseById(int courseId);                //通过id获得Course
    int add(Course course);                            //添加课程
    ArrayList getCoursesByPro_id(Integer pro_id);      //通过专业id获得课程
    int update(Course course);                         //修改Course
    int delete(Course course);                   //删除Course
}
