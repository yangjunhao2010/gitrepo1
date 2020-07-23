package com.jbit.blog.controller;

import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.service.BlogService;
import com.jbit.blog.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/all")
    public String quertBolg(int pageIndex, int pageSize, Model model){
        PageUtil<BlogEntity> pageUtil = blogService.allBolg(pageIndex,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "index";
    }

    /**
     * 添加
     * @param blogEntity
     * @return
     */
    @RequestMapping("/add")
    public String add(BlogEntity blogEntity){
        blogService.addBlog(blogEntity);
        return "add";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public String del(int id){
        blogService.delBolg(id);
        return "index";
    }
}
