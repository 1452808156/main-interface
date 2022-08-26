package com.iweb.sup.dao;

import java.sql.SQLException;
import java.util.List;

public interface BaseDAO <T, PK>{

    /**
     *
     * @param t   要保存的对象
     * @return   影响的行数
     * @throws SQLException
     */
    public int add(T t) throws SQLException;

    public int remove(T t) throws SQLException;

    public int modify(T t) throws SQLException;

    public T findByPK(PK pk) throws SQLException;

    public List<T> find() throws SQLException;





}
