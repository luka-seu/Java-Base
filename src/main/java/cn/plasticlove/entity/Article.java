package cn.plasticlove.entity;

import java.util.Date;

public class Article {
    private Long id;

    private String title;

    private Long userId;

    private String coverImage;

    private String content;

    private Boolean top;

    private Long typeId;

    private Boolean status;

    private Boolean recommended;

    private Boolean original;

    private String description;

    private String keywords;

    private Boolean comment;

    private Date createTime;

    private Date updateTime;

    private String contentMd;

    public Article(Long id, String title, Long userId, String coverImage, String content, Boolean top, Long typeId, Boolean status, Boolean recommended, Boolean original, String description, String keywords, Boolean comment, Date createTime, Date updateTime, String contentMd) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.coverImage = coverImage;
        this.content = content;
        this.top = top;
        this.typeId = typeId;
        this.status = status;
        this.recommended = recommended;
        this.original = original;
        this.description = description;
        this.keywords = keywords;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.contentMd = contentMd;
    }

    public Article() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Boolean getComment() {
        return comment;
    }

    public void setComment(Boolean comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getContentMd() {
        return contentMd;
    }

    public void setContentMd(String contentMd) {
        this.contentMd = contentMd == null ? null : contentMd.trim();
    }
}