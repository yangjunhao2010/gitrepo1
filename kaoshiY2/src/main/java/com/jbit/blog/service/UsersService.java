package com.jbit.blog.service;

import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.entity.UsersEntity;
import com.jbit.blog.util.PageUtil;

import java.util.List;

public interface UsersService {
    /**
     * 登录判断
     * @param userName
     * @param passWord
     * @return
     */
    int userLogo(String userName,String passWord);

    /**
     * 添加用户
     * @param usersEntity
     * @return
     */
    int addUser(UsersEntity usersEntity);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delUser(int id);

    /**
     * 分页查询用户
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageUtil<UsersEntity> selUser(int pageIndex, int pageSize);

    /**
     * 修改用户
     * @param usersEntity
     * @return
     */
    int updUser(UsersEntity usersEntity);
}
