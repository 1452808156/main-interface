package com.iweb.sup.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity

@Table(name = "t_areainfo", schema = "db_stm", catalog = "")

public class TArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "PID")
    private Integer pid;
    @Basic
    @Column(name = "AREA_NAME")
    private String areaName;
    @Basic
    @Column(name = "VISIBLE")
    private Short visible;
    @Basic
    @Column(name = "DISPLAYORDER")
    private Integer displayorder;
    @Basic
    @Column(name = "LVL")
    private Byte lvl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Short getVisible() {
        return visible;
    }

    public void setVisible(Short visible) {
        this.visible = visible;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public Byte getLvl() {
        return lvl;
    }

    public void setLvl(Byte lvl) {
        this.lvl = lvl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TArea tArea = (TArea) o;
        return id == tArea.id && Objects.equals(pid, tArea.pid) && Objects.equals(areaName, tArea.areaName) && Objects.equals(visible, tArea.visible) && Objects.equals(displayorder, tArea.displayorder) && Objects.equals(lvl, tArea.lvl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, areaName, visible, displayorder, lvl);
    }
}
