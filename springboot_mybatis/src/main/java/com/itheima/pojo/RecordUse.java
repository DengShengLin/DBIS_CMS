package com.itheima.pojo;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "record_use")
@ToString
public class RecordUse implements Serializable {
    @Id
    private Integer id;

    /**
     * 使用的资源的id
     */
    @Column(name = "record_property_id")
    private Integer recordPropertyId;

    /**
     * 使用者
     */
    @Column(name = "record_user_id")
    private Integer recordUserId;

    /**
     * 使用开始时间
     */
    @Column(name = "record_use_start_time")
    private Date recordUseStartTime;

    /**
     * 归还时间
     */
    @Column(name = "record_use_return_time")
    private Date recordUseReturnTime;

    /**
     * 授权人id
     */
    @Column(name = "record_grant_user_id")
    private Integer recordGrantUserId;

    /**
     * 已归还与未归还
     */
    @Column(name = "record_return")
    private Integer recordReturn;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取使用的资源的id
     *
     * @return record_property_id - 使用的资源的id
     */
    public Integer getRecordPropertyId() {
        return recordPropertyId;
    }

    /**
     * 设置使用的资源的id
     *
     * @param recordPropertyId 使用的资源的id
     */
    public void setRecordPropertyId(Integer recordPropertyId) {
        this.recordPropertyId = recordPropertyId;
    }

    /**
     * 获取使用者
     *
     * @return record_user_id - 使用者
     */
    public Integer getRecordUserId() {
        return recordUserId;
    }

    /**
     * 设置使用者
     *
     * @param recordUserId 使用者
     */
    public void setRecordUserId(Integer recordUserId) {
        this.recordUserId = recordUserId;
    }

    /**
     * 获取使用开始时间
     *
     * @return record_use_start_time - 使用开始时间
     */
    public Date getRecordUseStartTime() {
        return recordUseStartTime;
    }

    /**
     * 设置使用开始时间
     *
     * @param recordUseStartTime 使用开始时间
     */
    public void setRecordUseStartTime(Date recordUseStartTime) {
        this.recordUseStartTime = recordUseStartTime;
    }

    /**
     * 获取归还时间
     *
     * @return record_use_return_time - 归还时间
     */
    public Date getRecordUseReturnTime() {
        return recordUseReturnTime;
    }

    /**
     * 设置归还时间
     *
     * @param recordUseReturnTime 归还时间
     */
    public void setRecordUseReturnTime(Date recordUseReturnTime) {
        this.recordUseReturnTime = recordUseReturnTime;
    }

    /**
     * 获取授权人id
     *
     * @return record_grant_user_id - 授权人id
     */
    public Integer getRecordGrantUserId() {
        return recordGrantUserId;
    }

    /**
     * 设置授权人id
     *
     * @param recordGrantUserId 授权人id
     */
    public void setRecordGrantUserId(Integer recordGrantUserId) {
        this.recordGrantUserId = recordGrantUserId;
    }

    /**
     * 获取已归还与未归还
     *
     * @return record_return - 已归还与未归还
     */
    public Integer getRecordReturn() {
        return recordReturn;
    }

    /**
     * 设置已归还与未归还
     *
     * @param recordReturn 已归还与未归还
     */
    public void setRecordReturn(Integer recordReturn) {
        this.recordReturn = recordReturn;
    }
}