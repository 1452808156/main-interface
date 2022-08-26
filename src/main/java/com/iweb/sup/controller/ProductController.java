package com.iweb.sup.controller;

import com.iweb.sup.entity.TProduct;
import com.iweb.sup.service.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    TProductService service;
    /**
     *
     * @param product  json 格式的 product 数据 从前端过来
     */
    @PostMapping("/pub")
    public String publish(@RequestBody TProduct product){
       boolean back =  this.service.saveProduct(product);
       return back ? "success":"failed";
    }

}
