package com.iweb.sup.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity

@Table(name = "T_PRODUCT", schema = "db_stm", catalog = "")

public class TProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")

    private Integer id;

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

    private Integer userid;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

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


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TProduct tProduct = (TProduct) o;
        return tprice == tProduct.tprice && Objects.equals(id, tProduct.id) && Objects.equals(pname, tProduct.pname) && Objects.equals(desp, tProduct.desp) && Objects.equals(sprice, tProduct.sprice) && Objects.equals(userid, tProduct.userid) && Objects.equals(pubArea, tProduct.pubArea) && Objects.equals(saver, tProduct.saver) && Objects.equals(imga, tProduct.imga) && Objects.equals(imgb, tProduct.imgb) && Objects.equals(imgc, tProduct.imgc) && Objects.equals(ptime, tProduct.ptime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pname, desp, sprice, tprice, userid, pubArea, saver, imga, imgb, imgc, ptime);
    }
}
