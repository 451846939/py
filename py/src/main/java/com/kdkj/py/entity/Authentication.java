package com.kdkj.py.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Authentication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 身份证认证
     */
    @Column(name = "identity_authentication")
    private Integer identityAuthentication;

    /**
     * 手机号认证
     */
    @Column(name = "phone_authentication")
    private Integer phoneAuthentication;

    /**
     * 人脸认证
     */
    @Column(name = "face_authentication")
    private Integer faceAuthentication;

    /**
     * 邮箱认证
     */
    @Column(name = "email_authentication")
    private Integer emailAuthentication;

    /**
     * 芝麻信用认证
     */
    @Column(name = "sesame_authentication")
    private Integer sesameAuthentication;

    /**
     * 公安认证
     */
    @Column(name = "police_authentication")
    private Integer policeAuthentication;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取身份证认证
     *
     * @return identity_authentication - 身份证认证
     */
    public Integer getIdentityAuthentication() {
        return identityAuthentication;
    }

    /**
     * 设置身份证认证
     *
     * @param identityAuthentication 身份证认证
     */
    public void setIdentityAuthentication(Integer identityAuthentication) {
        this.identityAuthentication = identityAuthentication;
    }

    /**
     * 获取手机号认证
     *
     * @return phone_authentication - 手机号认证
     */
    public Integer getPhoneAuthentication() {
        return phoneAuthentication;
    }

    /**
     * 设置手机号认证
     *
     * @param phoneAuthentication 手机号认证
     */
    public void setPhoneAuthentication(Integer phoneAuthentication) {
        this.phoneAuthentication = phoneAuthentication;
    }

    /**
     * 获取人脸认证
     *
     * @return face_authentication - 人脸认证
     */
    public Integer getFaceAuthentication() {
        return faceAuthentication;
    }

    /**
     * 设置人脸认证
     *
     * @param faceAuthentication 人脸认证
     */
    public void setFaceAuthentication(Integer faceAuthentication) {
        this.faceAuthentication = faceAuthentication;
    }

    /**
     * 获取邮箱认证
     *
     * @return email_authentication - 邮箱认证
     */
    public Integer getEmailAuthentication() {
        return emailAuthentication;
    }

    /**
     * 设置邮箱认证
     *
     * @param emailAuthentication 邮箱认证
     */
    public void setEmailAuthentication(Integer emailAuthentication) {
        this.emailAuthentication = emailAuthentication;
    }

    /**
     * 获取芝麻信用认证
     *
     * @return sesame_authentication - 芝麻信用认证
     */
    public Integer getSesameAuthentication() {
        return sesameAuthentication;
    }

    /**
     * 设置芝麻信用认证
     *
     * @param sesameAuthentication 芝麻信用认证
     */
    public void setSesameAuthentication(Integer sesameAuthentication) {
        this.sesameAuthentication = sesameAuthentication;
    }

    /**
     * 获取公安认证
     *
     * @return police_authentication - 公安认证
     */
    public Integer getPoliceAuthentication() {
        return policeAuthentication;
    }

    /**
     * 设置公安认证
     *
     * @param policeAuthentication 公安认证
     */
    public void setPoliceAuthentication(Integer policeAuthentication) {
        this.policeAuthentication = policeAuthentication;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", identityAuthentication=").append(identityAuthentication);
        sb.append(", phoneAuthentication=").append(phoneAuthentication);
        sb.append(", faceAuthentication=").append(faceAuthentication);
        sb.append(", emailAuthentication=").append(emailAuthentication);
        sb.append(", sesameAuthentication=").append(sesameAuthentication);
        sb.append(", policeAuthentication=").append(policeAuthentication);
        sb.append("]");
        return sb.toString();
    }
}