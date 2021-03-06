package cn.rzpt.service.impl;

import cn.rzpt.dao.PlanDao;
import cn.rzpt.entity.Plan;
import cn.rzpt.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    private List list;
    @Autowired
    private Plan plan;
    @Autowired
    private PlanDao planDao;

    public ArrayList getPlanYears() {
        list=planDao.getPlanYears();
        return (ArrayList) list;
    }

    public ArrayList getPlanByYear(int year) {
        list=planDao.getPlanByYear(year);
        return (ArrayList) list;
    }

    public Plan getPlanByPro_id(int id) {
        plan=planDao.getPlanByPro_id(id);
        return plan;
    }

    public ArrayList getPlanYearsByDept_id(Integer dept_id) {
        list=planDao.getPlanYearsByDept_id(dept_id);
        return (ArrayList) list;
    }

    public ArrayList getPlanByYearAndDept_id(int year, int deptId) {
        list=planDao.getPlanByYearAndDept_id(year,deptId);
        return (ArrayList) list;
    }

    public Plan getPlanById(int id) {
        plan=planDao.getPlanById(id);
        return plan;
    }

    public ArrayList getPlansByState(int state) {
        list=planDao.getPlansByState(state);
        return (ArrayList) list;
    }

    public int getStateById(int planId) {
        int i=planDao.getStateById(planId);
        return i;
    }

    public void updateState(int planId,int state) {
        planDao.updateState(planId,state);
    }

}
