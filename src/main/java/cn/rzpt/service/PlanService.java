package cn.rzpt.service;

import cn.rzpt.entity.Plan;

import java.util.ArrayList;

public interface PlanService {
    Plan getPlanByPro_id(int id);                 //通过专业的id获得方案
    ArrayList getPlanYearsByDept_id(Integer dept_id);     //获得该用户的院部的所有方案的年度
    ArrayList getPlanByYearAndDept_id(int year, int deptId);  //通过年度和院部id获得本院部本年度的方案列表
    Plan getPlanById(int id);                      //通过id获得方案
}