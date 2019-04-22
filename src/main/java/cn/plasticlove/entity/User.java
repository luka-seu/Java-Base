package cn.plasticlove.entity;

import java.util.Date;

/**
 * The type User.
 */
public class User {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String email;

    private String sinaBlog;

    private Date birthday;

    private Byte gender;

    private String avatar;

    private String userType;

    private String github;

    private String location;

    private String source;

    private Byte privacy;

    private Byte notification;

    private String regIp;

    private String lastLoginIp;

    private Date lastLoginTime;

    private Integer loginCount;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date updateTime;






    /**
     * Instantiates a new User.
     *
     * @param id            the id
     * @param username      the username
     * @param password      the password
     * @param nickname      the nickname
     * @param mobile        the mobile
     * @param email         the email
     * @param sinaBlog      the sina blog
     * @param birthday      the birthday
     * @param gender        the gender
     * @param avatar        the avatar
     * @param userType      the user type
     * @param github        the github
     * @param location      the location
     * @param source        the source
     * @param privacy       the privacy
     * @param notification  the notification
     * @param regIp         the reg ip
     * @param lastLoginIp   the last login ip
     * @param lastLoginTime the last login time
     * @param loginCount    the login count
     * @param remark        the remark
     * @param status        the status
     * @param createTime    the create time
     * @param updateTime    the update time
     */
    public User(Long id, String username, String password, String nickname, String mobile, String email, String sinaBlog, Date birthday, Byte gender, String avatar, String userType, String github, String location, String source, Byte privacy, Byte notification, String regIp, String lastLoginIp, Date lastLoginTime, Integer loginCount, String remark, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.email = email;
        this.sinaBlog = sinaBlog;
        this.birthday = birthday;
        this.gender = gender;
        this.avatar = avatar;
        this.userType = userType;
        this.github = github;
        this.location = location;
        this.source = source;
        this.privacy = privacy;
        this.notification = notification;
        this.regIp = regIp;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
        this.remark = remark;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Instantiates a new User.
     *
     * @param nickname      the nickname
     * @param birthday      the birthday
     * @param userType      the user type
     * @param source        the source
     * @param privacy       the privacy
     * @param notification  the notification
     * @param regIp         the reg ip
     * @param lastLoginIp   the last login ip
     * @param lastLoginTime the last login time
     * @param loginCount    the login count
     * @param status        the status
     * @param createTime    the create time
     * @param updateTime    the update time
     */
    public User(String nickname, Date birthday, String userType, String source, Byte privacy, Byte notification, String regIp, String lastLoginIp, Date lastLoginTime, Integer loginCount, Integer status, Date createTime, Date updateTime) {
        this.nickname = nickname;
        this.birthday = birthday;
        this.userType = userType;
        this.source = source;
        this.privacy = privacy;
        this.notification = notification;
        this.regIp = regIp;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Instantiates a new User.
     */
    public User() {
        super();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * Gets sina blog.
     *
     * @return the sina blog
     */
    public String getSinaBlog() {
        return sinaBlog;
    }

    /**
     * Sets sina blog.
     *
     * @param sinaBlog the sina blog
     */
    public void setSinaBlog(String sinaBlog) {
        this.sinaBlog = sinaBlog == null ? null : sinaBlog.trim();
    }

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar.
     *
     * @param avatar the avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * Gets github.
     *
     * @return the github
     */
    public String getGithub() {
        return github;
    }

    /**
     * Sets github.
     *
     * @param github the github
     */
    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * Gets privacy.
     *
     * @return the privacy
     */
    public Byte getPrivacy() {
        return privacy;
    }

    /**
     * Sets privacy.
     *
     * @param privacy the privacy
     */
    public void setPrivacy(Byte privacy) {
        this.privacy = privacy;
    }

    /**
     * Gets notification.
     *
     * @return the notification
     */
    public Byte getNotification() {
        return notification;
    }

    /**
     * Sets notification.
     *
     * @param notification the notification
     */
    public void setNotification(Byte notification) {
        this.notification = notification;
    }

    /**
     * Gets reg ip.
     *
     * @return the reg ip
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * Sets reg ip.
     *
     * @param regIp the reg ip
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    /**
     * Gets last login ip.
     *
     * @return the last login ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * Sets last login ip.
     *
     * @param lastLoginIp the last login ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * Gets last login time.
     *
     * @return the last login time
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets last login time.
     *
     * @param lastLoginTime the last login time
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * Gets login count.
     *
     * @return the login count
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * Sets login count.
     *
     * @param loginCount the login count
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}