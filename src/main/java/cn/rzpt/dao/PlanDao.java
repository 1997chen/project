package cn.rzpt.dao;

import cn.rzpt.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PlanDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    private List list;
    private String hql;

    public Plan getPlanByPro_id(int id) {
        list=hibernateTemplate.find("from Plan where pro_id=?",id);
        return (Plan) list.get(0);
    }

    public List getPlanYearsByDept_id(Integer dept_id) {
        hql="select year from Plan where pro_id in (select id from Profession where dept_id=?)";
        list=hibernateTemplate.find(hql,dept_id);
        return list;
    }

    public List getPlanByYearAndDept_id(int year, int deptId) {
        hql="from Plan where year=? and pro_id in (select id from Profession where dept_id=?)";
        list=hibernateTemplate.find(hql,new Object[]{year,deptId});
        return list;
    }

    public Plan getPlanById(int id) {
        list=hibernateTemplate.find("from Plan where id=?",id);
        return (Plan) list.get(0);
    }
}
