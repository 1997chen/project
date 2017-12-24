package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*   课程
* */
@Component
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int type1;   //类别1：默认是0  0：通识教育课桌 1：专业教育课程 2：创新创业教育课程
    private int type2;   //类别2：默认是0  0：必修课程 1：选修课程 2：非课程类教育教学活动 3：基础通用课程 4：专业平台课程
    private int type3;   //类别3：默认是1  0：专业核心课程 1：非专业核心课程
    private int type4;   //类别4：默认是0  课程性质0：必修课 1：选项课
    private int type5;   //类别5：0：未归类 1：入学教育 2：军政训练 3：劳动教育 4：职场体验 5：整周实训 6：项目实践 7：顶岗实习
    private String name;    //课程名称
    private String cno;      //课程代码
    private Integer classHour;   //课程学时
    private Double grade;     //学分
    private Integer llGrade;      //理论学时
    private Integer sjGrade;      //实际学时
    private int term;      //学期
    private Integer weekHour;      //周课时
    private Integer weeks;      //周数
    private String content;      //*课程主要内容
    private String ability;      //*培养能力
    private int examScheme;      //考核方式：0：笔试 1：大作业+答辩 2：过程考核
    private Integer pro_id;      //外键：专业

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", type3=" + type3 +
                ", type4=" + type4 +
                ", type5=" + type5 +
                ", name='" + name + '\'' +
                ", cno='" + cno + '\'' +
                ", classHour=" + classHour +
                ", grade=" + grade +
                ", llGrade=" + llGrade +
                ", sjGrade=" + sjGrade +
                ", term=" + term +
                ", weekHour=" + weekHour +
                ", weeks=" + weeks +
                ", content='" + content + '\'' +
                ", ability='" + ability + '\'' +
                ", examScheme=" + examScheme +
                ", pro_id=" + pro_id +
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

    public int getType3() {
        return type3;
    }

    public void setType3(int type3) {
        this.type3 = type3;
    }

    public int getType4() {
        return type4;
    }

    public void setType4(int type4) {
        this.type4 = type4;
    }

    public int getType5() {
        return type5;
    }

    public void setType5(int type5) {
        this.type5 = type5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getLlGrade() {
        return llGrade;
    }

    public void setLlGrade(Integer llGrade) {
        this.llGrade = llGrade;
    }

    public Integer getSjGrade() {
        return sjGrade;
    }

    public void setSjGrade(Integer sjGrade) {
        this.sjGrade = sjGrade;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public Integer getWeekHour() {
        return weekHour;
    }

    public void setWeekHour(Integer weekHour) {
        this.weekHour = weekHour;
    }

    public Integer getWeeks() {
        return weeks;
    }

    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getExamScheme() {
        return examScheme;
    }

    public void setExamScheme(int examScheme) {
        this.examScheme = examScheme;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }
}
