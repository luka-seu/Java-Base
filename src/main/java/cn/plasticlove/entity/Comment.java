package cn.plasticlove.entity;

import java.util.Date;

public class Comment {
    private Long id;

    private Long aid;

    private Long userId;

    private Long pid;

    private String qq;

    private String nickname;

    private String avatar;

    private String email;

    private String url;

    private String status;

    private String ip;

    private String lng;

    private String lat;

    private String address;

    private String os;

    private String osShortName;

    private String browser;

    private String browserShortName;

    private String content;

    private String remark;

    private Integer support;

    private Integer oppose;

    private Date createTime;

    private Date updateTime;

    public Comment(Long id, Long aid, Long userId, Long pid, String qq, String nickname, String avatar, String email, String url, String status, String ip, String lng, String lat, String address, String os, String osShortName, String browser, String browserShortName, String content, String remark, Integer support, Integer oppose, Date createTime, Date updateTime) {
        this.id = id;
        this.aid = aid;
        this.userId = userId;
        this.pid = pid;
        this.qq = qq;
        this.nickname = nickname;
        this.avatar = avatar;
        this.email = email;
        this.url = url;
        this.status = status;
        this.ip = ip;
        this.lng = lng;
        this.lat = lat;
        this.address = address;
        this.os = os;
        this.osShortName = osShortName;
        this.browser = browser;
        this.browserShortName = browserShortName;
        this.content = content;
        this.remark = remark;
        this.support = support;
        this.oppose = oppose;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Comment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getOsShortName() {
        return osShortName;
    }

    public void setOsShortName(String osShortName) {
        this.osShortName = osShortName == null ? null : osShortName.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getBrowserShortName() {
        return browserShortName;
    }

    public void setBrowserShortName(String browserShortName) {
        this.browserShortName = browserShortName == null ? null : browserShortName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getOppose() {
        return oppose;
    }

    public void setOppose(Integer oppose) {
        this.oppose = oppose;
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