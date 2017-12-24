package cn.rzpt.service;

import cn.rzpt.entity.Class1;

import java.util.ArrayList;

public interface Class1Service {
    int add(Class1 class1);                         //添加班级
    ArrayList getClass1sByPro_id(int proId);        //通过专业的id查看此专业的所有班级
    Class1 getClass1ById(int id);                   //通过id获得班级
    int updateClass1(Class1 class1);                //修改班级
    int deleteClass1(Class1 class1);                   //删除班级
}
