package com.iweb.sup.serviceImpl;

import com.iweb.sup.entity.TUinfo;
import com.iweb.sup.service.TUinfoService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service("tuserinfoservice2")
public class TUserinfoServiceImpl2 implements TUinfoService {
    @Override
    public boolean addUser(TUinfo user) throws SQLException {
        return false;
    }

    @Override
    public boolean phoneCheck(TUinfo user){
        return false;
    }
    @Override
    public int validateUser(String phone, String passcode) {
        return 0;
    }
}
