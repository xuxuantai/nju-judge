package cn.edu.nju.software.judge.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.privilege_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer privilegeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.nick_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.password
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.md5_salt
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String md5Salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.nation
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.create_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.email
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.motto
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String motto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.avatar
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.qq
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.school
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.blog
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String blog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.openId
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.last_login_ip
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String lastLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.last_login_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer solved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.state
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime addDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime updateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _user.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _user
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.user_id
     *
     * @return the value of _user.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.user_id
     *
     * @param userId the value for _user.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.privilege_id
     *
     * @return the value of _user.privilege_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getPrivilegeId() {
        return privilegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.privilege_id
     *
     * @param privilegeId the value for _user.privilege_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.user_name
     *
     * @return the value of _user.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.user_name
     *
     * @param userName the value for _user.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.nick_name
     *
     * @return the value of _user.nick_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.nick_name
     *
     * @param nickName the value for _user.nick_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.password
     *
     * @return the value of _user.password
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.password
     *
     * @param password the value for _user.password
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.md5_salt
     *
     * @return the value of _user.md5_salt
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getMd5Salt() {
        return md5Salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.md5_salt
     *
     * @param md5Salt the value for _user.md5_salt
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setMd5Salt(String md5Salt) {
        this.md5Salt = md5Salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.nation
     *
     * @return the value of _user.nation
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.nation
     *
     * @param nation the value for _user.nation
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.create_time
     *
     * @return the value of _user.create_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.create_time
     *
     * @param createTime the value for _user.create_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.email
     *
     * @return the value of _user.email
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.email
     *
     * @param email the value for _user.email
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.motto
     *
     * @return the value of _user.motto
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getMotto() {
        return motto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.motto
     *
     * @param motto the value for _user.motto
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setMotto(String motto) {
        this.motto = motto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.avatar
     *
     * @return the value of _user.avatar
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.avatar
     *
     * @param avatar the value for _user.avatar
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.qq
     *
     * @return the value of _user.qq
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.qq
     *
     * @param qq the value for _user.qq
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.school
     *
     * @return the value of _user.school
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.school
     *
     * @param school the value for _user.school
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.blog
     *
     * @return the value of _user.blog
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getBlog() {
        return blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.blog
     *
     * @param blog the value for _user.blog
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.openId
     *
     * @return the value of _user.openId
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.openId
     *
     * @param openid the value for _user.openId
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.last_login_ip
     *
     * @return the value of _user.last_login_ip
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.last_login_ip
     *
     * @param lastLoginIp the value for _user.last_login_ip
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.last_login_time
     *
     * @return the value of _user.last_login_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.last_login_time
     *
     * @param lastLoginTime the value for _user.last_login_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.submit
     *
     * @return the value of _user.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSubmit() {
        return submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.submit
     *
     * @param submit the value for _user.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmit(Integer submit) {
        this.submit = submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.solved
     *
     * @return the value of _user.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSolved() {
        return solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.solved
     *
     * @param solved the value for _user.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSolved(Integer solved) {
        this.solved = solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.state
     *
     * @return the value of _user.state
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.state
     *
     * @param state the value for _user.state
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.add_datetime
     *
     * @return the value of _user.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getAddDatetime() {
        return addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.add_datetime
     *
     * @param addDatetime the value for _user.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setAddDatetime(LocalDateTime addDatetime) {
        this.addDatetime = addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.update_datetime
     *
     * @return the value of _user.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.update_datetime
     *
     * @param updateDatetime the value for _user.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _user.del
     *
     * @return the value of _user.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _user.del
     *
     * @param del the value for _user.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _user
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPrivilegeId() == null ? other.getPrivilegeId() == null : this.getPrivilegeId().equals(other.getPrivilegeId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getMd5Salt() == null ? other.getMd5Salt() == null : this.getMd5Salt().equals(other.getMd5Salt()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMotto() == null ? other.getMotto() == null : this.getMotto().equals(other.getMotto()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getBlog() == null ? other.getBlog() == null : this.getBlog().equals(other.getBlog()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getSubmit() == null ? other.getSubmit() == null : this.getSubmit().equals(other.getSubmit()))
            && (this.getSolved() == null ? other.getSolved() == null : this.getSolved().equals(other.getSolved()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getAddDatetime() == null ? other.getAddDatetime() == null : this.getAddDatetime().equals(other.getAddDatetime()))
            && (this.getUpdateDatetime() == null ? other.getUpdateDatetime() == null : this.getUpdateDatetime().equals(other.getUpdateDatetime()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _user
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPrivilegeId() == null) ? 0 : getPrivilegeId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getMd5Salt() == null) ? 0 : getMd5Salt().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMotto() == null) ? 0 : getMotto().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getBlog() == null) ? 0 : getBlog().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getSubmit() == null) ? 0 : getSubmit().hashCode());
        result = prime * result + ((getSolved() == null) ? 0 : getSolved().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getAddDatetime() == null) ? 0 : getAddDatetime().hashCode());
        result = prime * result + ((getUpdateDatetime() == null) ? 0 : getUpdateDatetime().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        return result;
    }
}