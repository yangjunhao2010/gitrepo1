package com.jbit.blog.dao;

import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.entity.UsersEntity;

import java.util.List;


/**
 * 用户持久层
 */
public interface UsersDao {

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
    List<UsersEntity> selUser(int pageIndex, int pageSize);

    /**
     * 修改用户
     * @param usersEntity
     * @return
     */
    int updUser(UsersEntity usersEntity);

    /**
     * 查询总数量
     * @return
     */
    int userCount();
}
