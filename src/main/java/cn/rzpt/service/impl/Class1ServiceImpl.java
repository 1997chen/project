package cn.rzpt.service.impl;

import cn.rzpt.dao.Class1Dao;
import cn.rzpt.entity.Class1;
import cn.rzpt.service.Class1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Class1ServiceImpl implements Class1Service{
    private List list;
    @Autowired
    private Class1Dao class1Dao;

    @Autowired
    private Class1 class1;
    public int add(Class1 class1) {
        int i=class1Dao.add(class1);
        return i;
    }

    public ArrayList getClass1sByPro_id(int proId) {
        list=class1Dao.getClass1sByPro_id(proId);
        return (ArrayList) list;
    }

    public Class1 getClass1ById(int id) {
        class1=class1Dao.getClass1ById(id);
        return class1;
    }

    public int updateClass1(Class1 class1) {
        int i=class1Dao.updateClass1(class1);
        return i;
    }

    public int deleteClass1(Class1 class1) {
        int i=class1Dao.deleteClass1(class1);
        return i;
    }
}
