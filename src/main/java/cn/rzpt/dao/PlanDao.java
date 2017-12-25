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

    public List getPlanYears() {
        list = hibernateTemplate.find("select distinct year from Plan order by state desc ");
        return list;
    }

    public List getPlanByYear(int year) {
        list = hibernateTemplate.find("from Plan where year=?", year);
        return list;
    }

    public Plan getPlanByPro_id(int id) {
        list = hibernateTemplate.find("from Plan where pro_id=?", id);
        return (Plan) list.get(0);
    }

    public List getPlanYearsByDept_id(Integer dept_id) {
        hql = "select distinct year from Plan where pro_id in (select id from Profession where dept_id=?) order by state desc";
        list = hibernateTemplate.find(hql, dept_id);
        return list;
    }

    public List getPlanByYearAndDept_id(int year, int deptId) {
        hql = "from Plan where year=? and pro_id in (select id from Profession where dept_id=?)";
        list = hibernateTemplate.find(hql, new Object[]{year, deptId});
        return list;
    }

    public Plan getPlanById(int id) {
        list = hibernateTemplate.find("from Plan where id=?", id);
        return (Plan) list.get(0);
    }

    public List getPlansByState(int state) {
        list=hibernateTemplate.find("from Plan where state=?",state);
        return list;
    }

    public int getStateById(int planId) {
        list=hibernateTemplate.find("select state from Plan where id=?",planId);
        String str=list.get(0).toString();
        return Integer.parseInt(str);
    }

    public void updateState(int planId, int state) {
        hibernateTemplate.find("update Plan set state=? where id=?",new Object[]{state,planId});
    }
}
