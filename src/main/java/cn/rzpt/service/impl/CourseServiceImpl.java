package cn.rzpt.service.impl;

import cn.rzpt.dao.CourseDao;
import cn.rzpt.entity.Course;
import cn.rzpt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private List list;
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private Course course;

    public int add(Course course) {
        int i=courseDao.add(course);
        return i;
    }

    public ArrayList getCoursesByPro_id(Integer pro_id) {
        list=courseDao.getCoursesByPro_id(pro_id);
        return (ArrayList) list;
    }

    public Course getCourseById(int courseId) {
        course=courseDao.getCourseById(courseId);
        return course;
    }

    public int update(Course course) {
        int i=courseDao.update(course);
        return i;
    }

    public int delete(Course course) {
        int i=courseDao.delete(course);
        return i;
    }
}
