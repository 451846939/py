package com.kdkj.py.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 名字
     */
    private String name;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 是否可用
     */
    private Integer available;

    /**
     * 权限以:形式
     */
    private String permission;

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
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取角色描述
     *
     * @return description - 角色描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置角色描述
     *
     * @param description 角色描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
     * 获取权限以:形式
     *
     * @return permission - 权限以:形式
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限以:形式
     *
     * @param permission 权限以:形式
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append(", available=").append(available);
        sb.append(", permission=").append(permission);
        sb.append("]");
        return sb.toString();
    }
}