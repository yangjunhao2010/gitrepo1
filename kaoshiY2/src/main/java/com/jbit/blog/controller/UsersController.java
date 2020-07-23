package com.jbit.blog.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.entity.UsersEntity;
import com.jbit.blog.service.UsersService;
import com.jbit.blog.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UsersService usersService;

    /**
     * 登录判断
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping("/login")
    public String login(String name,String pwd){
        int res = usersService.userLogo(name,pwd);
        if(res < 0){
            return "login";
        }else{
            return "index";
        }
    }

    /**
     * 添加
     * @param usersEntity
     * @return
     */
    @RequestMapping("/add")
    public String add(UsersEntity usersEntity,@RequestParam("filename") MultipartFile file){
        // 获取文件名
        String fileName = file.getOriginalFilename();

        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 文件上传路径
        String filePath = "D:\\AllProject\\blog\\src\\main\\resources\\static\\FileUpload\\";
        // 解决中文问题,liunx 下中文路径,图片显示问题
        //fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath + fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            //上传
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        usersEntity.setPicpath(filePath+fileName);
        return "index";
    }
    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public String del(int id){
        usersService.delUser(id);
        return "index";
    }
    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/all")
    public String quertUser(int pageIndex, int pageSize, Model model){
        PageUtil<UsersEntity> pageUtil = usersService.selUser(pageIndex,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "index";
    }
    /**
     * 删除
     * @param usersEntity
     * @return
     */
    @RequestMapping("/upd")
    public String upd(UsersEntity usersEntity){
        usersService.updUser(usersEntity);
        return "index";
    }
}
