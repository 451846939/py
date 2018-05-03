package com.kdkj.py.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "py_activity")
public class PyActivity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 拼友方式
     */
    @Column(name = "py_mode_id")
    private String pyModeId;

    /**
     * 开始时间
     */
    @Column(name = "start_place")
    private String startPlace;

    /**
     * 结束地点
     */
    @Column(name = "end_place")
    private String endPlace;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 需要的人数
     */
    @Column(name = "user_num")
    private Integer userNum;

    /**
     * 性别要求
     */
    @Column(name = "sex_requirement")
    private Integer sexRequirement;

    /**
     * 住宿方式
     */
    private Integer accommodation;

    /**
     * 食物金额
     */
    @Column(name = "food_expenses")
    private BigDecimal foodExpenses;

    /**
     * 支付方式
     */
    @Column(name = "paying_type")
    private Integer payingType;

    /**
     * 图片
     */
    private String picture;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 补充内容
     */
    @Column(name = "supplementary_content")
    private String supplementaryContent;

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
     * 获取拼友方式
     *
     * @return py_mode_id - 拼友方式
     */
    public String getPyModeId() {
        return pyModeId;
    }

    /**
     * 设置拼友方式
     *
     * @param pyModeId 拼友方式
     */
    public void setPyModeId(String pyModeId) {
        this.pyModeId = pyModeId == null ? null : pyModeId.trim();
    }

    /**
     * 获取开始时间
     *
     * @return start_place - 开始时间
     */
    public String getStartPlace() {
        return startPlace;
    }

    /**
     * 设置开始时间
     *
     * @param startPlace 开始时间
     */
    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace == null ? null : startPlace.trim();
    }

    /**
     * 获取结束地点
     *
     * @return end_place - 结束地点
     */
    public String getEndPlace() {
        return endPlace;
    }

    /**
     * 设置结束地点
     *
     * @param endPlace 结束地点
     */
    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace == null ? null : endPlace.trim();
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取需要的人数
     *
     * @return user_num - 需要的人数
     */
    public Integer getUserNum() {
        return userNum;
    }

    /**
     * 设置需要的人数
     *
     * @param userNum 需要的人数
     */
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    /**
     * 获取性别要求
     *
     * @return sex_requirement - 性别要求
     */
    public Integer getSexRequirement() {
        return sexRequirement;
    }

    /**
     * 设置性别要求
     *
     * @param sexRequirement 性别要求
     */
    public void setSexRequirement(Integer sexRequirement) {
        this.sexRequirement = sexRequirement;
    }

    /**
     * 获取住宿方式
     *
     * @return accommodation - 住宿方式
     */
    public Integer getAccommodation() {
        return accommodation;
    }

    /**
     * 设置住宿方式
     *
     * @param accommodation 住宿方式
     */
    public void setAccommodation(Integer accommodation) {
        this.accommodation = accommodation;
    }

    /**
     * 获取食物金额
     *
     * @return food_expenses - 食物金额
     */
    public BigDecimal getFoodExpenses() {
        return foodExpenses;
    }

    /**
     * 设置食物金额
     *
     * @param foodExpenses 食物金额
     */
    public void setFoodExpenses(BigDecimal foodExpenses) {
        this.foodExpenses = foodExpenses;
    }

    /**
     * 获取支付方式
     *
     * @return paying_type - 支付方式
     */
    public Integer getPayingType() {
        return payingType;
    }

    /**
     * 设置支付方式
     *
     * @param payingType 支付方式
     */
    public void setPayingType(Integer payingType) {
        this.payingType = payingType;
    }

    /**
     * 获取图片
     *
     * @return picture - 图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片
     *
     * @param picture 图片
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取订单状态
     *
     * @return status - 订单状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取补充内容
     *
     * @return supplementary_content - 补充内容
     */
    public String getSupplementaryContent() {
        return supplementaryContent;
    }

    /**
     * 设置补充内容
     *
     * @param supplementaryContent 补充内容
     */
    public void setSupplementaryContent(String supplementaryContent) {
        this.supplementaryContent = supplementaryContent == null ? null : supplementaryContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pyModeId=").append(pyModeId);
        sb.append(", startPlace=").append(startPlace);
        sb.append(", endPlace=").append(endPlace);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", userNum=").append(userNum);
        sb.append(", sexRequirement=").append(sexRequirement);
        sb.append(", accommodation=").append(accommodation);
        sb.append(", foodExpenses=").append(foodExpenses);
        sb.append(", payingType=").append(payingType);
        sb.append(", picture=").append(picture);
        sb.append(", status=").append(status);
        sb.append(", supplementaryContent=").append(supplementaryContent);
        sb.append("]");
        return sb.toString();
    }
}