package com.iweb.sup.controller;

import com.iweb.sup.entity.TUinfo;
import com.iweb.sup.pojo.TempUser;
import com.iweb.sup.service.TUinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
public class UserOperation {

    @Autowired
    TUinfoService service;

    @RequestMapping(path = "/reg", method = RequestMethod.POST)
    public String regist(@RequestBody TUinfo user){
        try {

            if(service.addUser(user)){
                return "OK";
            }else{
                return "FAILED";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
