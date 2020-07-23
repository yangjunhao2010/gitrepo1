package com.jbit.blog.dao;


import com.jbit.blog.entity.BlogEntity;

import java.util.List;

/**
 * 微博持久层
 */
public interface BlogDao {
    /**
     * 添加微博
     * @param blogEntity
     * @return
     */
    int addBlog(BlogEntity blogEntity);

    /**
     * 删除微博
     * @param id
     * @return
     */
    int delBolg(int id);

    /**
     * 分页查询微博消息
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<BlogEntity> allBolg(int pageIndex,int pageSize);

    /**
     * 查询数量
     * @return
     */
    int bolgCount();
}
