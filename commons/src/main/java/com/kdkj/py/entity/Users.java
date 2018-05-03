package com.kdkj.py.entity;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Users implements Serializable {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "pass_word")
    @NotEmpty
    private String passWord;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 头像
     */
    @Column(name = "head_portrait")
    private String headPortrait;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 注册时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 账号状态(1正常 0禁用)
     */
    @NotNull
    private Integer status;

    /**
     * 邮箱
     */
    @Email
    private String email;

    /**
     * 电话
     */
    @NotEmpty
    @Pattern(regexp = "^[1][3,4,5,7,8][0-9]{9}$",message = "请输入正确的电话号码")
    private String phone;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 次数
     */
    private Integer frequency;

    /**
     * 在线状态
     */
    @Column(name = "online_state")
    private Integer onlineState;

    /**
     * 简介
     */
    private String profile;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户账号
     *
     * @return user_name - 用户账号
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户账号
     *
     * @param userName 用户账号
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户密码
     *
     * @return pass_word - 用户密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置用户密码
     *
     * @param passWord 用户密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取头像
     *
     * @return head_portrait - 头像
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 设置头像
     *
     * @param headPortrait 头像
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * 获取爱好
     *
     * @return hobby - 爱好
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置爱好
     *
     * @param hobby 爱好
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * 获取注册时间
     *
     * @return create_time - 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置注册时间
     *
     * @param createTime 注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return update_time - 最后登录时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param updateTime 最后登录时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取账号状态(1正常 0禁用)
     *
     * @return status - 账号状态(1正常 0禁用)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置账号状态(1正常 0禁用)
     *
     * @param status 账号状态(1正常 0禁用)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取评分
     *
     * @return score - 评分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置评分
     *
     * @param score 评分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取次数
     *
     * @return frequency - 次数
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * 设置次数
     *
     * @param frequency 次数
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 获取在线状态
     *
     * @return online_state - 在线状态
     */
    public Integer getOnlineState() {
        return onlineState;
    }

    /**
     * 设置在线状态
     *
     * @param onlineState 在线状态
     */
    public void setOnlineState(Integer onlineState) {
        this.onlineState = onlineState;
    }

    /**
     * 获取简介
     *
     * @return profile - 简介
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置简介
     *
     * @param profile 简介
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", headPortrait=").append(headPortrait);
        sb.append(", hobby=").append(hobby);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", score=").append(score);
        sb.append(", frequency=").append(frequency);
        sb.append(", onlineState=").append(onlineState);
        sb.append(", profile=").append(profile);
        sb.append("]");
        return sb.toString();
    }
}