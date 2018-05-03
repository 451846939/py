package com.kdkj.py.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table(name = "users_role")
public class UsersRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    @NotEmpty(message = "角色id不能为空")
    private String roleId;

    /**
     * 用户id
     */
    @Column(name = "users_id")
    @NotEmpty(message = "用户id不能为空")
    private String usersId;

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
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 获取用户id
     *
     * @return users_id - 用户id
     */
    public String getUsersId() {
        return usersId;
    }

    /**
     * 设置用户id
     *
     * @param usersId 用户id
     */
    public void setUsersId(String usersId) {
        this.usersId = usersId == null ? null : usersId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", usersId=").append(usersId);
        sb.append("]");
        return sb.toString();
    }
}