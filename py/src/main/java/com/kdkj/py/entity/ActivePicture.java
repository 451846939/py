package com.kdkj.py.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "active_picture")
public class ActivePicture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(), -, ')")
    private String id;

    /**
     * 文件id
     */
    @Column(name = "files_id")
    private String filesId;

    /**
     * 创建时间
     */
    private Date date;

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
     * 获取文件id
     *
     * @return files_id - 文件id
     */
    public String getFilesId() {
        return filesId;
    }

    /**
     * 设置文件id
     *
     * @param filesId 文件id
     */
    public void setFilesId(String filesId) {
        this.filesId = filesId == null ? null : filesId.trim();
    }

    /**
     * 获取创建时间
     *
     * @return date - 创建时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置创建时间
     *
     * @param date 创建时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", filesId=").append(filesId);
        sb.append(", date=").append(date);
        sb.append("]");
        return sb.toString();
    }
}