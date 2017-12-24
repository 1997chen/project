package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*   人才培养方案实体
* */
@Component
@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int type;  // 类型 0面向职场版 1普通版
    private String name;
    private int zhaosheng;  //招生对象  0普通高中毕业生 1中等职业学校毕业生
    private int xuezhi;   //学制  0三年 1两年 2专科
    private String byyq;  //毕业要求
    private String jxSuggest;  //教学建议
    private String szSuggest;   //继续专业学习深造建议
    private int state; //状态 0草稿 1提交 2院部审核通过 -2院部审核不通过 3教务处审核通过 -3教务处审核不通过 4应用
    private int classCnt;      //使用班级数量
    private Integer year;   //xxx级学生
    private String submitTime;    //提交时间
    private String check1Time;     //院部审核通过时间
    private String check2Time;     //教务处审核通过时间
    private Integer llHour;          //理论学时
    private Integer sjHour;           //实践学时
    private Integer hours;            //总学时
    private Integer grades;           //总学分
    private int subUser_id;       // user外键 指定人
    private int user1_id;          //院部审核通过人
    private int user2_id;          //外键 教务处审核通过人
    private int pro_id;             //外键 专业

    public Plan() {
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", zhaosheng=" + zhaosheng +
                ", xuezhi=" + xuezhi +
                ", byyq='" + byyq + '\'' +
                ", jxSuggest='" + jxSuggest + '\'' +
                ", szSuggest='" + szSuggest + '\'' +
                ", state=" + state +
                ", classCnt=" + classCnt +
                ", year=" + year +
                ", submitTime='" + submitTime + '\'' +
                ", check1Time='" + check1Time + '\'' +
                ", check2Time='" + check2Time + '\'' +
                ", llHour=" + llHour +
                ", sjHour=" + sjHour +
                ", hours=" + hours +
                ", grades=" + grades +
                ", subUser_id=" + subUser_id +
                ", user1_id=" + user1_id +
                ", user2_id=" + user2_id +
                ", pro_id=" + pro_id +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZhaosheng() {
        return zhaosheng;
    }

    public void setZhaosheng(int zhaosheng) {
        this.zhaosheng = zhaosheng;
    }

    public int getXuezhi() {
        return xuezhi;
    }

    public void setXuezhi(int xuezhi) {
        this.xuezhi = xuezhi;
    }

    public String getByyq() {
        return byyq;
    }

    public void setByyq(String byyq) {
        this.byyq = byyq;
    }

    public String getJxSuggest() {
        return jxSuggest;
    }

    public void setJxSuggest(String jxSuggest) {
        this.jxSuggest = jxSuggest;
    }

    public String getSzSuggest() {
        return szSuggest;
    }

    public void setSzSuggest(String szSuggest) {
        this.szSuggest = szSuggest;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getClassCnt() {
        return classCnt;
    }

    public void setClassCnt(int classCnt) {
        this.classCnt = classCnt;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getCheck1Time() {
        return check1Time;
    }

    public void setCheck1Time(String check1Time) {
        this.check1Time = check1Time;
    }

    public String getCheck2Time() {
        return check2Time;
    }

    public void setCheck2Time(String check2Time) {
        this.check2Time = check2Time;
    }

    public Integer getLlHour() {
        return llHour;
    }

    public void setLlHour(Integer llHour) {
        this.llHour = llHour;
    }

    public Integer getSjHour() {
        return sjHour;
    }

    public void setSjHour(Integer sjHour) {
        this.sjHour = sjHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }

    public int getSubUser_id() {
        return subUser_id;
    }

    public void setSubUser_id(int subUser_id) {
        this.subUser_id = subUser_id;
    }

    public int getUser1_id() {
        return user1_id;
    }

    public void setUser1_id(int user1_id) {
        this.user1_id = user1_id;
    }

    public int getUser2_id() {
        return user2_id;
    }

    public void setUser2_id(int user2_id) {
        this.user2_id = user2_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }
}