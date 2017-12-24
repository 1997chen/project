package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
 *   各类课程学时比例
 * */
@Component
@Entity
@Table(name = "analysis2")
public class Analysis2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int type1;   //类别1：默认为0  0：通识教育课程 1：专业教育课程 2：创新创业教育课程
    private int type2;   //类别2：默认为0 0：必修课程 1：选修课程 2：非课程类教育教学活动3：基础通用课程 4：专业平台课程 5：岗位导向课程
    private int llGrade;  //理论学时
    private int sjGrade;   //实际学时
    private int hours;   //总学时
    private int grades;   //总学分
    private int plan_id;   //外键：人才培养方案

    public Analysis2() {
    }

    @Override
    public String toString() {
        return "Analysis2{" +
                "id=" + id +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", llGrade=" + llGrade +
                ", sjGrade=" + sjGrade +
                ", hours=" + hours +
                ", grades=" + grades +
                ", plan_id=" + plan_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public int getLlGrade() {
        return llGrade;
    }

    public void setLlGrade(int llGrade) {
        this.llGrade = llGrade;
    }

    public int getSjGrade() {
        return sjGrade;
    }

    public void setSjGrade(int sjGrade) {
        this.sjGrade = sjGrade;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
