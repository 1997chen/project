package cn.rzpt.dao;

import cn.rzpt.entity.Class1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class Class1Dao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    private List list;
    private String hql;

    public int add(Class1 class1) {
        try {
            list = hibernateTemplate.find("from Class1 where name=?", class1.getName());
            if (list.size() > 0) {
                return -1;
            }
            hibernateTemplate.save(class1);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List getClass1sByPro_id(int proId) {
        list=hibernateTemplate.find("from Class1 where pro_id=?",proId);
        return list;
    }

    public Class1 getClass1ById(int id) {
        list=hibernateTemplate.find("from Class1 where id=?",id);
        return (Class1) list.get(0);
    }

    public int updateClass1(Class1 class1) {
        try {
            hibernateTemplate.update(class1);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteClass1(Class1 class1) {
        try {
            hibernateTemplate.delete(class1);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
