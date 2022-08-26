package com.iweb.sup.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity

@Table(name = "T_UINFO", schema = "db_stm", catalog = "")

public class TUinfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "PHONE")
    private String phone;
    @Basic
    @Column(name = "PASSCODE")
    private String passcode;
    @Basic
    @Column(name = "GENDER")
    private String gender;
    @Basic
    @Column(name = "NICK")
    private String nick;
    @Basic

    @Column(name = "RegTIME")

    private Date rtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUinfo tUinfo = (TUinfo) o;
        return Objects.equals(id, tUinfo.id) && Objects.equals(phone, tUinfo.phone) && Objects.equals(passcode, tUinfo.passcode) && Objects.equals(gender, tUinfo.gender) && Objects.equals(nick, tUinfo.nick) && Objects.equals(rtime, tUinfo.rtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phone, passcode, gender, nick, rtime);
    }
}
