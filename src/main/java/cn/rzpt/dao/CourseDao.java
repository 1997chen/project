package cn.rzpt.dao;

import cn.rzpt.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    private List list;
    public int add(Course course) {
        try {
            list=hibernateTemplate.find("from Course where name=?",course.getName());
            if (list.size()>0){
                return -1;
            }
            hibernateTemplate.save(course);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List getCoursesByPro_id(Integer pro_id) {
        list=hibernateTemplate.find("from Course where pro_id=?",pro_id);
        return list;
    }

    public Course getCourseById(int courseId) {
        list=hibernateTemplate.find("from Course where id=?",courseId);
        return (Course) list.get(0);
    }

    public int update(Course course) {
        try {
            hibernateTemplate.update(course);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int delete(Course course) {
        try {
            hibernateTemplate.delete(course);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
