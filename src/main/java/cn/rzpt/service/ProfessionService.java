package cn.rzpt.service;

import cn.rzpt.entity.Profession;

import java.util.ArrayList;

public interface ProfessionService {
    ArrayList getProsByDept_id(Integer dept_id);         //通过院部id获得该院部的所有专业

    Profession getProById(int proId);                   //通过id获得专业
}
