package com.jbit.blog.service;

import com.jbit.blog.dao.BlogDao;
import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImp implements  BlogService{
    @Autowired
    BlogDao dao;


    @Override
    public int addBlog(BlogEntity blogEntity) {
        return dao.addBlog(blogEntity);
    }

    @Override
    public int delBolg(int id) {
        return dao.delBolg(id);
    }

    @Override
    public PageUtil<BlogEntity> allBolg(int pageIndex, int pageSize) {
        PageUtil<BlogEntity> pageUtil = new PageUtil<BlogEntity>();
        pageUtil.setPageIndex((pageIndex-1) * pageSize);
        pageUtil.setPageSize(pageSize);
        pageUtil.setTotaCount(dao.bolgCount());
        pageUtil.setPagedata(dao.allBolg(pageUtil.getPageIndex(),pageUtil.getPageSize()));
        if (pageUtil.getTotaCount() % pageUtil.getPageSize() == 0) {
            pageUtil.setTotaPageNumber(pageUtil.getTotaCount() / pageUtil.getPageSize());
        } else {
            pageUtil.setTotaPageNumber(pageUtil.getTotaCount() / pageUtil.getPageSize() + 1);
        }
        return pageUtil;
    }
}
