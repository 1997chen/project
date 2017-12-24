package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String pwd;
    private String realName;
    private int state;    //0：超级管理员 1.院部管理员 2.教研室主任3.老师
    private Integer dept_id;   //院部id
    private Integer pro_id;     //专业id

    public User() {
    }

    public User(int id, String name, String pwd, String realName, int state, Integer dept_id, Integer pro_id) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.realName = realName;
        this.state = state;
        this.dept_id = dept_id;
        this.pro_id = pro_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", state=" + state +
                ", dept_id=" + dept_id +
                ", pro_id=" + pro_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }
}
