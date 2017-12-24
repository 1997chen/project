package cn.rzpt.dao;

import cn.rzpt.entity.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProfessionDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    private List list;
    private String hql;

    public List getProsByDept_id(int dept_id) {
        list=hibernateTemplate.find("from Profession where dept_id=?",dept_id);
        return list;
    }

    public Profession getProById(int proId) {
        list=hibernateTemplate.find("from Profession where id=?",proId);
        return (Profession) list.get(0);
    }
}
