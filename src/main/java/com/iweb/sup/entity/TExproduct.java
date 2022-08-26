package com.iweb.sup.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity

@Table(name = "T_EXPRODUCT", schema = "db_stm", catalog = "")

public class TExproduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "PNAME")
    private String pname;
    @Basic
    @Column(name = "DESP")
    private String desp;
    @Basic
    @Column(name = "SPRICE")
    private Integer sprice;
    @Basic
    @Column(name = "TPRICE")
    private int tprice;
    @Basic
    @Column(name = "USERID")
    private BigInteger userid;
    @Basic
    @Column(name = "PUB_AREA")
    private String pubArea;
    @Basic
    @Column(name = "SAVER")
    private BigInteger saver;
    @Basic
    @Column(name = "IMGA")
    private String imga;
    @Basic
    @Column(name = "IMGB")
    private String imgb;
    @Basic
    @Column(name = "IMGC")
    private String imgc;
    @Basic
    @Column(name = "PTIME")
    private Date ptime;
    @Basic
    @Column(name = "STIME")
    private Date stime;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public Integer getSprice() {
        return sprice;
    }

    public void setSprice(Integer sprice) {
        this.sprice = sprice;
    }

    public int getTprice() {
        return tprice;
    }

    public void setTprice(int tprice) {
        this.tprice = tprice;
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public String getPubArea() {
        return pubArea;
    }

    public void setPubArea(String pubArea) {
        this.pubArea = pubArea;
    }

    public BigInteger getSaver() {
        return saver;
    }

    public void setSaver(BigInteger saver) {
        this.saver = saver;
    }

    public String getImga() {
        return imga;
    }

    public void setImga(String imga) {
        this.imga = imga;
    }

    public String getImgb() {
        return imgb;
    }

    public void setImgb(String imgb) {
        this.imgb = imgb;
    }

    public String getImgc() {
        return imgc;
    }

    public void setImgc(String imgc) {
        this.imgc = imgc;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TExproduct that = (TExproduct) o;
        return tprice == that.tprice && Objects.equals(id, that.id) && Objects.equals(pname, that.pname) && Objects.equals(desp, that.desp) && Objects.equals(sprice, that.sprice) && Objects.equals(userid, that.userid) && Objects.equals(pubArea, that.pubArea) && Objects.equals(saver, that.saver) && Objects.equals(imga, that.imga) && Objects.equals(imgb, that.imgb) && Objects.equals(imgc, that.imgc) && Objects.equals(ptime, that.ptime) && Objects.equals(stime, that.stime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pname, desp, sprice, tprice, userid, pubArea, saver, imga, imgb, imgc, ptime, stime);
    }
}
