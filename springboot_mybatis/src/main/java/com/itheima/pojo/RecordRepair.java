package com.itheima.pojo;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "record_repair")
@ToString
public class RecordRepair implements Serializable {
    @Id
    private Integer id;

    @Column(name = "record_id")
    private Integer recordId;

    /**
     * 维修开始时间
     */
    @Column(name = "repair_time")
    private Date repairTime;

    /**
     * 维修花费
     */
    @Column(name = "repair_cost")
    private double repairCost;

    /**
     * 维修完成时间
     */
    @Column(name = "repair_finish_time")
    private Date repairFinishTime;

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
     * @return record_id
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * @param recordId
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取维修开始时间
     *
     * @return repair_time - 维修开始时间
     */
    public Date getRepairTime() {
        return repairTime;
    }

    /**
     * 设置维修开始时间
     *
     * @param repairTime 维修开始时间
     */
    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    /**
     * 获取维修花费
     *
     * @return repair_cost - 维修花费
     */
    public double getRepairCost() {
        return repairCost;
    }

    /**
     * 设置维修花费
     *
     * @param repairCost 维修花费
     */
    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    /**
     * 获取维修完成时间
     *
     * @return repair_finish_time - 维修完成时间
     */
    public Date getRepairFinishTime() {
        return repairFinishTime;
    }

    /**
     * 设置维修完成时间
     *
     * @param repairFinishTime 维修完成时间
     */
    public void setRepairFinishTime(Date repairFinishTime) {
        this.repairFinishTime = repairFinishTime;
    }
}