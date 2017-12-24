package cn.rzpt.dao;

import cn.rzpt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    private List list;
    private String hql;

    public User getUserById(int id) {
        try{
            list=hibernateTemplate.find("from User where id=?",id);
            if (list.size()>0){
                return (User) list.get(0);
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public int add(User user) {
        try {
            //检查是否有用户已存在
            list=hibernateTemplate.find("from User where name=?",user.getName());
            if (list.size()>0){
                return -1;
            }
            hibernateTemplate.save(user);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List getUsersByDept_id(int dept_id) {
        list=hibernateTemplate.find("from User where dept_id=? and state=3",dept_id);
        return list;
    }

    public int deleteUser(User user) {
        try {
            hibernateTemplate.delete(user);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public int updateUser(final User user) {
        try {
            hibernateTemplate.update(user);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
