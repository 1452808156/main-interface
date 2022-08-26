package com.iweb.sup.serviceImpl;

import com.iweb.sup.dao.TUinfoDAO;
import com.iweb.sup.entity.TUinfo;
import com.iweb.sup.service.TUinfoService;

import com.iweb.sup.util.AttributeNames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.servlet.http.HttpSession;

import java.sql.SQLException;


@Service("uinfoservice")
public class TUinfoServiceImpl implements TUinfoService {

    @Autowired
    TUinfoDAO dao;


    @Autowired
    HttpSession session;


    /**
     * 这个方法用来 控制  dao 去将 用户数据库插入到数据库中
     * @param user  用户信息
     * @return   1 成功   0 没成功
     */
    @Override
    public boolean addUser(TUinfo user) throws SQLException {
        return dao.add(user) <= 0 ? false: true;
    }


    @Override
    public boolean phoneCheck(TUinfo user){
        return dao.findByPhone(user.getPhone())!=null ? true: false;
    }




    /**
     * 验证用户信息
     * @param phone
     * @param passcode
     * @return   0 正确    1 手机号不对     2 密码 不对    3 系统内部异常
     */
    @Override
    public int validateUser(String phone, String passcode) {
        TUinfo user = this.dao.findByPhone(phone);
        if(user == null){
            return 1;
        }else{
            // 密码
            if(passcode.equals(user.getPasscode())){
                // 全对
                this.session.setAttribute(AttributeNames.USERINFO, user);
                return 0;
            }
            return 2;
        }
    }

}
