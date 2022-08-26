package com.iweb.sup.daoImpl;

import com.iweb.sup.dao.TUinfoDAO;
import com.iweb.sup.entity.TUinfo;

import com.iweb.sup.rowmappers.TUinfoRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository("tuinfodao")
public class TUinfoDAOImpl implements TUinfoDAO {

    @Autowired
    JdbcTemplate template;

    @Override
    public int add(TUinfo tUinfo) throws SQLException {

        String sql = "INSERT INTO t_uinfo(phone, passcode, gender, nick, regtime) VALUES(?,?,?,?,?)";

        int result = template.update(sql, tUinfo.getPhone(), tUinfo.getPasscode(),
                tUinfo.getGender(), tUinfo.getNick(), new Date());

        return result;
    }

    @Override
    public int remove(TUinfo tUinfo) throws SQLException {
        return 0;
    }

    @Override
    public int modify(TUinfo tUinfo) throws SQLException {
        return 0;
    }

    @Override
    public TUinfo findByPK(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public List<TUinfo> find() throws SQLException {
        return null;
    }



    @Override
    public TUinfo findByPhone(String phone) {
        String sql = "SELECT * FROM t_uinfo WHERE phone = ?";

        List<TUinfo> users = this.template.query(sql, new TUinfoRowmapper(), phone);
        if(users == null || users.size() == 0){
            return null;
        }
        return users.get(0);

    }
}
