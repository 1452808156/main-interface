package com.iweb.sup.rowmappers;

import com.iweb.sup.entity.TUinfo;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TUinfoRowmapper implements RowMapper<TUinfo> {
    @Override
    public TUinfo mapRow(ResultSet rs, int rowNum) throws SQLException {

        TUinfo user = new TUinfo();
        user.setId(rs.getInt("id"));
        user.setPhone(rs.getString("phone"));
        user.setPasscode(rs.getString("passcode"));
        user.setGender(rs.getString("gender"));
        user.setNick(rs.getString("nick"));
//        user.setRtime(rs.g);

        return user;
    }
}
