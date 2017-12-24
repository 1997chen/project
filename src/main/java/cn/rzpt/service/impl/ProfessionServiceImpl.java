package cn.rzpt.service.impl;

import cn.rzpt.dao.ProfessionDao;
import cn.rzpt.entity.Profession;
import cn.rzpt.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService{
    private List list;
    @Autowired
    private Profession profession;
    @Autowired
    private ProfessionDao professionDao;

    public ArrayList getProsByDept_id(Integer dept_id) {
        list=professionDao.getProsByDept_id(dept_id);
        return (ArrayList) list;
    }

    public Profession getProById(int proId) {
        profession=professionDao.getProById(proId);
        return profession;
    }
}
