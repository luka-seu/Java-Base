package cn.plasticlove.entity;

import java.util.Date;

public class Type {
    private Long id;

    private Long pid;

    private String typename;

    private String description;

    private Integer sort;

    private String icon;

    private Boolean available;

    private Date createTime;

    private Date updateTime;

    public Type(Long id, Long pid, String typename, String description, Integer sort, String icon, Boolean available, Date createTime, Date updateTime) {
        this.id = id;
        this.pid = pid;
        this.typename = typename;
        this.description = description;
        this.sort = sort;
        this.icon = icon;
        this.available = available;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Type() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
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
}