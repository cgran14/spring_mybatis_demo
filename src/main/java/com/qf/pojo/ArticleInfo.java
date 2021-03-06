package com.qf.pojo;

import java.sql.Timestamp;

public class ArticleInfo {
    private long articleId;
    private Integer areaId;
    private long userId;
    private String articleName;
    private long typeId;
    private String mainTitle;
    private String subTitle;
    private String content;
    private Integer status;
    private Timestamp creatTime;
    private Timestamp updateTime;

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ArticleInfo{" +
                "articleId=" + articleId +
                ", areaId=" + areaId +
                ", userId=" + userId +
                ", articleName='" + articleName + '\'' +
                ", typeId=" + typeId +
                ", mainTitle='" + mainTitle + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
