package com.iweb.sup.service;

import com.iweb.sup.entity.TUinfo;

import java.sql.SQLException;

public interface TUinfoService {
    public boolean addUser(TUinfo user) throws SQLException;


    public boolean phoneCheck(TUinfo user);

    public int validateUser(String phone, String passcode);

}
