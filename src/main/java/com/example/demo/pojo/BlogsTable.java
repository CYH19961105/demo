package com.example.demo.pojo;

import java.util.Date;

public class BlogsTable {
    private Integer blogsId;

    private String blogsTitle;

    private Date blogsEndtime;

    private Integer blogsUserid;

    private Date blogsCreattime;

    private String blogsType;

    private Integer blogsLike;

    private String blogsContent;

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsTitle() {
        return blogsTitle;
    }

    public void setBlogsTitle(String blogsTitle) {
        this.blogsTitle = blogsTitle == null ? null : blogsTitle.trim();
    }

    public Date getBlogsEndtime() {
        return blogsEndtime;
    }

    public void setBlogsEndtime(Date blogsEndtime) {
        this.blogsEndtime = blogsEndtime;
    }

    public Integer getBlogsUserid() {
        return blogsUserid;
    }

    public void setBlogsUserid(Integer blogsUserid) {
        this.blogsUserid = blogsUserid;
    }

    public Date getBlogsCreattime() {
        return blogsCreattime;
    }

    public void setBlogsCreattime(Date blogsCreattime) {
        this.blogsCreattime = blogsCreattime;
    }

    public String getBlogsType() {
        return blogsType;
    }

    public void setBlogsType(String blogsType) {
        this.blogsType = blogsType == null ? null : blogsType.trim();
    }

    public Integer getBlogsLike() {
        return blogsLike;
    }

    public void setBlogsLike(Integer blogsLike) {
        this.blogsLike = blogsLike;
    }

    public String getBlogsContent() {
        return blogsContent;
    }

    public void setBlogsContent(String blogsContent) {
        this.blogsContent = blogsContent == null ? null : blogsContent.trim();
    }
}