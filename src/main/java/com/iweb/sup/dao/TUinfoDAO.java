package com.iweb.sup.dao;

import com.iweb.sup.entity.TUinfo;

import java.sql.SQLException;

public interface TUinfoDAO extends BaseDAO<TUinfo, Integer>{


    // 是 Userinfo 表专属的 属性查询 不可以放入 base 中
    public TUinfo findByPhone(String phone);


}
