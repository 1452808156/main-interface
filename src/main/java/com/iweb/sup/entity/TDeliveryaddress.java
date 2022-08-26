package com.iweb.sup.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity

@Table(name = "T_DELIVERYADDRESS", schema = "db_stm", catalog = "")

public class TDeliveryaddress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "PROVINCE")
    private BigInteger province;
    @Basic
    @Column(name = "CITY")
    private BigInteger city;
    @Basic
    @Column(name = "DISTRICT")
    private BigInteger district;
    @Basic
    @Column(name = "DADD")
    private String dadd;
    @Basic
    @Column(name = "TNAME")
    private String tname;
    @Basic
    @Column(name = "PCODE")
    private BigInteger pcode;
    @Basic
    @Column(name = "PHONE")
    private String phone;
    @Basic
    @Column(name = "ISUSED")
    private String isused;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getProvince() {
        return province;
    }

    public void setProvince(BigInteger province) {
        this.province = province;
    }

    public BigInteger getCity() {
        return city;
    }

    public void setCity(BigInteger city) {
        this.city = city;
    }

    public BigInteger getDistrict() {
        return district;
    }

    public void setDistrict(BigInteger district) {
        this.district = district;
    }

    public String getDadd() {
        return dadd;
    }

    public void setDadd(String dadd) {
        this.dadd = dadd;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public BigInteger getPcode() {
        return pcode;
    }

    public void setPcode(BigInteger pcode) {
        this.pcode = pcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsused() {
        return isused;
    }

    public void setIsused(String isused) {
        this.isused = isused;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TDeliveryaddress that = (TDeliveryaddress) o;
        return Objects.equals(id, that.id) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(district, that.district) && Objects.equals(dadd, that.dadd) && Objects.equals(tname, that.tname) && Objects.equals(pcode, that.pcode) && Objects.equals(phone, that.phone) && Objects.equals(isused, that.isused);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, province, city, district, dadd, tname, pcode, phone, isused);
    }
}
