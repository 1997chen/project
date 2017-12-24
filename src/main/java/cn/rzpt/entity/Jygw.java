package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*   就业岗位
* */
@Component
@Entity
@Table(name = "jygw")
public class Jygw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int type;     //岗位面向 0初始就业岗位 1发展就业岗位
    private int job1_id;  //外键  岗位
    private int job2_id;  //外键  岗位
    private int plan_id;  //外键  方案

    public Jygw() {
    }

    @Override
    public String toString() {
        return "Jygw{" +
                "id=" + id +
                ", type=" + type +
                ", job1_id=" + job1_id +
                ", job2_id=" + job2_id +
                ", plan_id=" + plan_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getJob1_id() {
        return job1_id;
    }

    public void setJob1_id(int job1_id) {
        this.job1_id = job1_id;
    }

    public int getJob2_id() {
        return job2_id;
    }

    public void setJob2_id(int job2_id) {
        this.job2_id = job2_id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
