package com.kdkj.py.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Files implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 路径
     */
    private String path;

    /**
     * 原名
     */
    private String oldname;

    /**
     * 更改后名字
     */
    private String newname;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

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
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 获取原名
     *
     * @return oldname - 原名
     */
    public String getOldname() {
        return oldname;
    }

    /**
     * 设置原名
     *
     * @param oldname 原名
     */
    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    /**
     * 获取更改后名字
     *
     * @return newname - 更改后名字
     */
    public String getNewname() {
        return newname;
    }

    /**
     * 设置更改后名字
     *
     * @param newname 更改后名字
     */
    public void setNewname(String newname) {
        this.newname = newname == null ? null : newname.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return update_date - 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改时间
     *
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", path=").append(path);
        sb.append(", oldname=").append(oldname);
        sb.append(", newname=").append(newname);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }
}