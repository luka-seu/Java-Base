package cn.plasticlove.entity;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String email;

    private String qq;

    private Date birthday;

    private Byte gender;

    private String avatar;

    private String userType;

    private String company;

    private String blog;

    private String location;

    private String source;

    private Byte privacy;

    private Byte notification;

    private Integer score;

    private Integer experience;

    private String regIp;

    private String lastLoginIp;

    private Date lastLoginTime;

    private Integer loginCount;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public User(Long id, String username, String password, String nickname, String mobile, String email, String qq, Date birthday, Byte gender, String avatar, String userType, String company, String blog, String location, String source, Byte privacy, Byte notification, Integer score, Integer experience, String regIp, String lastLoginIp, Date lastLoginTime, Integer loginCount, String remark, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.email = email;
        this.qq = qq;
        this.birthday = birthday;
        this.gender = gender;
        this.avatar = avatar;
        this.userType = userType;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.source = source;
        this.privacy = privacy;
        this.notification = notification;
        this.score = score;
        this.experience = experience;
        this.regIp = regIp;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
        this.remark = remark;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog == null ? null : blog.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Byte getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Byte privacy) {
        this.privacy = privacy;
    }

    public Byte getNotification() {
        return notification;
    }

    public void setNotification(Byte notification) {
        this.notification = notification;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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