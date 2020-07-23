package com.jbit.blog.service;

import com.jbit.blog.entity.BlogEntity;
import com.jbit.blog.util.PageUtil;

import java.util.List;

public interface BlogService {
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
    PageUtil<BlogEntity> allBolg(int pageIndex, int pageSize);
}
