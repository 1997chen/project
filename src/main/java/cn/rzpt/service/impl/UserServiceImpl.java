package cn.rzpt.service.impl;

import cn.rzpt.dao.ProfessionDao;
import cn.rzpt.dao.UserDao;
import cn.rzpt.entity.User;
import cn.rzpt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userdao;
    @Autowired
    private ProfessionDao professionDao;
    private User user;
    private List list;

    public User getUserById(int id) {
        user = userdao.getUserById(id);
        return user;
    }

    public ArrayList getProsByUser_id(int id) {
        user = userdao.getUserById(id);
        list = professionDao.getProsByDept_id(user.getDept_id());
        return (ArrayList) list;
    }

    public int teacher_add2(User user) {
        int i = userdao.add(user);
        return i;
    }

    public ArrayList getTeachers(int id) {
        user=userdao.getUserById(id);
        list=userdao.getUsersByDept_id(user.getDept_id());
        return (ArrayList) list;
    }

    public ArrayList getTeachersByDept_id(int dept_id) {
        list=userdao.getUsersByDept_id(dept_id);
        return (ArrayList) list;
    }

    public int deleteUser(User user) {
        int i=userdao.deleteUser(user);
        return i;
    }

    public int updateTeacher(User user) {
        int i=userdao.updateUser(user);
        return i;
    }


    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void setProfessionDao(ProfessionDao professionDao) {
        this.professionDao = professionDao;
    }
}
