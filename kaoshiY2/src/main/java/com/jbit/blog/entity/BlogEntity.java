package com.jbit.blog.entity;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

import java.util.Date;


/**
 * BLOG
 * 
 * @author bianj
 * @version 1.0.0 2020-05-24
 */

public class BlogEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4591035196242379090L;

    /** id */
    private Integer id;

    /** content */
    private String content;

    /** publishtime */
    private String publishtime;

    /** userid */
    private Integer userid;

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取content
     * 
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置content
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取publishtime
     * 
     * @return publishtime
     */
    public String getPublishtime() {
        return this.publishtime;
    }

    /**
     * 设置publishtime
     * 
     * @param publishtime
     */
    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * 获取userid
     * 
     * @return userid
     */
    public Integer getUserid() {
        return this.userid;
    }

    /**
     * 设置userid
     * 
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}