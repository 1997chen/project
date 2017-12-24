package cn.rzpt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DeptDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    private List list;
    private String hql;


}
