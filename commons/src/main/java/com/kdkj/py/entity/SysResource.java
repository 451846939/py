package com.kdkj.py.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_resource")
public class SysResource implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源类型
     */
    private String type;

    /**
     * 显示顺序
     */
    private Integer priority;

    /**
     * 父编号
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 权限字符串
     */
    private String permission;

    /**
     * 是否可用
     */
    private Integer available;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取资源类型
     *
     * @return type - 资源类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型
     *
     * @param type 资源类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取显示顺序
     *
     * @return priority - 显示顺序
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置显示顺序
     *
     * @param priority 显示顺序
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取父编号
     *
     * @return parent_id - 父编号
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父编号
     *
     * @param parentId 父编号
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取权限字符串
     *
     * @return permission - 权限字符串
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限字符串
     *
     * @param permission 权限字符串
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * 获取是否可用
     *
     * @return available - 是否可用
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置是否可用
     *
     * @param available 是否可用
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", priority=").append(priority);
        sb.append(", parentId=").append(parentId);
        sb.append(", permission=").append(permission);
        sb.append(", available=").append(available);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}