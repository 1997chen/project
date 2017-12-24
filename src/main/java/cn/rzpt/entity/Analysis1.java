package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/*
*   教学分配表
* */
@Component
@Entity
@Table(name = "analysis1")
public class Analysis1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int term;        //学期
    private int rxjy;        //入学教育
    private int jzxl;        //军政训练
    private int ldjy;        //劳动教育
    private int zcty;        //职场体验
    private int zzsx;        //整周实训
    private int xmsj;        //项目实践
    private int dgsx;        //顶岗实习
    private int bylx;        //毕业离校
    private int jdzs;        //机动周数
    private int kszs;        //考试周数
    private int knjx;        //课内教学
    private int jqzs;        //假期周数
    private int zzs;        //总周数
    private int plan_id;        //外键：人才培养方案

    public Analysis1() {
    }

    @Override
    public String toString() {
        return "Analysis1{" +
                "id=" + id +
                ", term=" + term +
                ", rxjy=" + rxjy +
                ", jzxl=" + jzxl +
                ", ldjy=" + ldjy +
                ", zcty=" + zcty +
                ", zzsx=" + zzsx +
                ", xmsj=" + xmsj +
                ", dgsx=" + dgsx +
                ", bylx=" + bylx +
                ", jdzs=" + jdzs +
                ", kszs=" + kszs +
                ", knjx=" + knjx +
                ", jqzs=" + jqzs +
                ", zzs=" + zzs +
                ", plan_id=" + plan_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getRxjy() {
        return rxjy;
    }

    public void setRxjy(int rxjy) {
        this.rxjy = rxjy;
    }

    public int getJzxl() {
        return jzxl;
    }

    public void setJzxl(int jzxl) {
        this.jzxl = jzxl;
    }

    public int getLdjy() {
        return ldjy;
    }

    public void setLdjy(int ldjy) {
        this.ldjy = ldjy;
    }

    public int getZcty() {
        return zcty;
    }

    public void setZcty(int zcty) {
        this.zcty = zcty;
    }

    public int getZzsx() {
        return zzsx;
    }

    public void setZzsx(int zzsx) {
        this.zzsx = zzsx;
    }

    public int getXmsj() {
        return xmsj;
    }

    public void setXmsj(int xmsj) {
        this.xmsj = xmsj;
    }

    public int getDgsx() {
        return dgsx;
    }

    public void setDgsx(int dgsx) {
        this.dgsx = dgsx;
    }

    public int getBylx() {
        return bylx;
    }

    public void setBylx(int bylx) {
        this.bylx = bylx;
    }

    public int getJdzs() {
        return jdzs;
    }

    public void setJdzs(int jdzs) {
        this.jdzs = jdzs;
    }

    public int getKszs() {
        return kszs;
    }

    public void setKszs(int kszs) {
        this.kszs = kszs;
    }

    public int getKnjx() {
        return knjx;
    }

    public void setKnjx(int knjx) {
        this.knjx = knjx;
    }

    public int getJqzs() {
        return jqzs;
    }

    public void setJqzs(int jqzs) {
        this.jqzs = jqzs;
    }

    public int getZzs() {
        return zzs;
    }

    public void setZzs(int zzs) {
        this.zzs = zzs;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
