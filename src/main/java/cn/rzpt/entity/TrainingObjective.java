package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*   培养目标
* */
@Component
@Entity
@Table(name = "trainingobjective")
public class TrainingObjective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int type1;      //培养目标类别 0 培养目标 1培养规格
    private int type2;      //培养规格类型 0知识目标 1能力目标 2素质目标
    private String content;   //x详情
    private int plan_id;     //外键 人才培养方案

    public TrainingObjective() {
    }

    @Override
    public String toString() {
        return "TrainingObjective{" +
                "id=" + id +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", content='" + content + '\'' +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
