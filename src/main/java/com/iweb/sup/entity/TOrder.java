package com.iweb.sup.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity

@Table(name = "T_ORDER", schema = "db_stm", catalog = "")

public class TOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "PID")
    private BigInteger pid;
    @Basic
    @Column(name = "USERID")
    private BigInteger userid;
    @Basic
    @Column(name = "EID")
    private BigInteger eid;
    @Basic
    @Column(name = "OTIME")
    private Date otime;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getPid() {
        return pid;
    }

    public void setPid(BigInteger pid) {
        this.pid = pid;
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getEid() {
        return eid;
    }

    public void setEid(BigInteger eid) {
        this.eid = eid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrder tOrder = (TOrder) o;
        return Objects.equals(id, tOrder.id) && Objects.equals(pid, tOrder.pid) && Objects.equals(userid, tOrder.userid) && Objects.equals(eid, tOrder.eid) && Objects.equals(otime, tOrder.otime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, userid, eid, otime);
    }
}
