package com.iweb.sup.daoImpl;

import com.iweb.sup.dao.TProductDAO;
import com.iweb.sup.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository("tproductdao")
public class TProductDAOImpl implements TProductDAO {

    @Autowired
    JdbcTemplate template;

    @Override
    public int add(TProduct tProduct) throws SQLException {

        String sql = "INSERT INTO t_product(pname, desp, sprice, tprice, userid, pub_area, imga, ptime) " +
                "VALUES(?,?,?,?,?,?,?,?)";

        return this.template.update(sql, tProduct.getPname(), tProduct.getDesp(), tProduct.getSprice(), tProduct.getTprice(), tProduct.getUserid(),
                tProduct.getPubArea(), tProduct.getImga(), new Date());
    }

    @Override
    public int remove(TProduct tProduct) throws SQLException {
        return 0;
    }

    @Override
    public int modify(TProduct tProduct) throws SQLException {
        return 0;
    }

    @Override
    public TProduct findByPK(Integer integer) throws SQLException {
        return null;
    }

    @Override
    public List<TProduct> find() throws SQLException {
        return null;
    }
}
