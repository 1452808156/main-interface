//老师原版，用于上传图片

package com.iweb.sup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class ImgUploadController {

    /**
     * 用来上传文件的
     * @param uploadfilea  从客户端过来的文件对象（此对象已经被 spring 包装过）
     * @param request  主要帮助我们获取服务器的 绝对路径
     * @return   返回结果
     */
    @PostMapping("/uploadimg")
    public String uploadImage(MultipartFile uploadfilea, HttpServletRequest request){
        // 确定服务器 存储 图片的路径
        String path = request.getSession().getServletContext().getRealPath("/imgs/");
        System.out.println(path);
        // 创建这个路径
        File folder = new File(path);
        if(folder.isDirectory() == false){
            folder.mkdirs();
        }

        // 获取上传文件的文件名称
        String oldname = uploadfilea.getOriginalFilename();
        // 使用 UUID 生成一个随机字符串
        String newname = UUID.randomUUID().toString()+oldname.substring(oldname.lastIndexOf("."));

        try {
            // 将缓冲中的图片移动到 指定的目录下
            uploadfilea.transferTo(new File(folder, newname));

            // 生成网路地址
            String fpath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/imgs/"+newname;
            System.out.println(fpath);
            return "redirect:imgshow.html?fname="+newname;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
