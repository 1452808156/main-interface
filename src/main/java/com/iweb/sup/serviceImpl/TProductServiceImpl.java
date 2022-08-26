package com.iweb.sup.serviceImpl;

import com.iweb.sup.dao.TProductDAO;
import com.iweb.sup.entity.TProduct;
import com.iweb.sup.entity.TUinfo;
import com.iweb.sup.service.TProductService;
import com.iweb.sup.util.AttributeNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Service("tproductservice")
public class TProductServiceImpl implements TProductService {


    @Autowired
    TProductDAO dao;

    @Autowired
    HttpSession session;

    @Override
    public boolean saveProduct(TProduct product) {
        // 用户的id
        TUinfo user  =(TUinfo) session.getAttribute(AttributeNames.USERINFO);
        if(user == null){
            return false;
        }
        // 发布人的id
        product.setUserid(user.getId());
        // 检查是否有  sprice
        if(product.getSprice() == null){
            product.setSprice(product.getTprice());
        }

        try {
            int back = dao.add(product);
            return back > 0 ? true: false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
