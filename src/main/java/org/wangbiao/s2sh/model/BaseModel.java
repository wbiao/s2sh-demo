/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.model;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Wang Biao on 15/10/27.
 */
@MappedSuperclass
public class BaseModel implements Serializable, Comparable<BaseModel> {

    private static final long serialVersionUID = 4037358666814957139L;

    /**
     * ID 主键
     */
    @Id
    @Column(length = 36, updatable = false)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", updatable = false)
    private Date createTime;

    /**
     * 修改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    /**
     * 版本号,用于hibernate乐观锁控制
     */
    @Version
    @Column(name = "VERSION")
    private Integer version;

    /**
     * 显示名
     */
    @Column(name = "DISPLAY_NAME")
    private String displayName;

    /**
     * 排序号
     */
    @Column(name = "SORT_INDEX")
    private Long sortIndex = System.currentTimeMillis();

    public int compareTo(BaseModel o) {
        return new CompareToBuilder().append(this.getSortIndex(), o.getSortIndex()).toComparison();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass().isAssignableFrom(o.getClass())){
            BaseModel baseModel = (BaseModel) o;
            return new EqualsBuilder().append(this.getId(), baseModel.getId()).isEquals();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(this.getId(), this.getDisplayName()).toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Long sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
