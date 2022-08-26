package com.iweb.sup.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iweb.sup.dao.TUinfoDAO;
import com.iweb.sup.entity.TUinfo;
import com.iweb.sup.pojo.TempUser;
import com.iweb.sup.service.TUinfoService;
import com.iweb.sup.util.AttributeNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    @Qualifier("uinfoservice")
    TUinfoService service;

    @RequestMapping(path = "/reg", method = RequestMethod.POST)
    public String regist(@RequestBody TUinfo user){
        try {
            if(service.phoneCheck(user)){
                return "UsedP";
            }
            else if(service.addUser(user)){
                return "OK";
            }else{
//                System.out.println("sdsdsd");
                return "FAILED";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping( path = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("phone1") String phone, @RequestParam("password1") String passcode){
        String result = "";
        // 呼叫管家进行 身份验证
        switch (this.service.validateUser(phone,passcode)){
            case 0:
                result = "200";
                break;
            case 1:
                result = "201";
                break;
            case 2:
                result = "202";
                break;
            default:
                result = "500";
        }

        return result;
    }

    @RequestMapping("/getcurruser")
    @ResponseBody
    public TUinfo getCurrent(HttpSession session){
        return (TUinfo) session.getAttribute(AttributeNames.USERINFO);
    }

}
