package com.jbit.blog.service;

import com.jbit.blog.dao.UsersDao;
import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.entity.UsersEntity;
import com.jbit.blog.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersSrviceImp implements UsersService{
    @Autowired
    UsersDao dao;
    @Override
    public int userLogo(String userName, String passWord) {
        return dao.userLogo(userName,passWord);
    }

    @Override
    public int addUser(UsersEntity usersEntity) {
        return dao.addUser(usersEntity);
    }

    @Override
    public int delUser(int id) {
        return dao.delUser(id);
    }

    @Override
    public PageUtil<UsersEntity> selUser(int pageIndex, int pageSize) {
        PageUtil<UsersEntity> pageUtil = new PageUtil<UsersEntity>();
        pageUtil.setPageIndex((pageIndex-1) * pageSize);
        pageUtil.setPageSize(pageSize);
        pageUtil.setTotaCount(dao.userCount());
        pageUtil.setPagedata(dao.selUser(pageUtil.getPageIndex(),pageUtil.getPageSize()));
        if (pageUtil.getTotaCount() % pageUtil.getPageSize() == 0) {
            pageUtil.setTotaPageNumber(pageUtil.getTotaCount() / pageUtil.getPageSize());
        } else {
            pageUtil.setTotaPageNumber(pageUtil.getTotaCount() / pageUtil.getPageSize() + 1);
        }
        return pageUtil;
    }

    @Override
    public int updUser(UsersEntity usersEntity) {
        return dao.updUser(usersEntity);
    }
}
