package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*    审核意见
* */
@Component
@Entity
@Table(name = "shyj")
public class Shyj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;     //内容
    private String checkTime;   //.审核时间
    private int state;    //审核级别：默认为0  0：院部审核 1：教务处审核
    private int user_id;    //外键：审核人
    private int plan_id;   //外键：人才培养方案

    public Shyj() {
    }

    @Override
    public String toString() {
        return "Shyj{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", checkTime='" + checkTime + '\'' +
                ", state=" + state +
                ", user_id=" + user_id +
                ", plan_id=" + plan_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
