package cn.rzpt.entity;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
 *   专业实体
 * */

@Component
@Entity
@Table(name = "profession")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String pno;   //专业代码
    private int state;   //专业状态0招生中 1停止招生
    private String note;   //备注
    private Integer userCnt;   //教师数
    private Integer classCnt;   //班级数
    private int dept_id;    //院部id

    public Profession() {
    }

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pno='" + pno + '\'' +
                ", state=" + state +
                ", note='" + note + '\'' +
                ", userCnt=" + userCnt +
                ", classCnt=" + classCnt +
                ", dept_id=" + dept_id +
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

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getUserCnt() {
        return userCnt;
    }

    public void setUserCnt(Integer userCnt) {
        this.userCnt = userCnt;
    }

    public Integer getClassCnt() {
        return classCnt;
    }

    public void setClassCnt(Integer classCnt) {
        this.classCnt = classCnt;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}
