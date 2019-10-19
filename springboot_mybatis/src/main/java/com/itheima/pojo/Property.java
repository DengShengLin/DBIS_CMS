package com.itheima.pojo;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ToString
public class Property implements Serializable {
    @Id
    private Integer id;

    @Column(name = "property_name")
    private String propertyName;

    @Column(name = "property_brief")
    private String propertyBrief;

    @Column(name = "property_category")
    private String propertyCategory;

    /**
     * 购入时间
     */
    @Column(name = "property_buy_time")
    private Date propertyBuyTime;

    /**
     * 资产的所属人
     */
    @Column(name = "property_belong")
    private String propertyBelong;

    /**
     * 资产的原价值
     */
    @Column(name = "property_value_old")
    private String propertyValueOld;

    /**
     * 资产的先价值
     */
    @Column(name = "property_value")
    private String propertyValue;

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
     * @return property_name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * @param propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * @return property_brief
     */
    public String getPropertyBrief() {
        return propertyBrief;
    }

    /**
     * @param propertyBrief
     */
    public void setPropertyBrief(String propertyBrief) {
        this.propertyBrief = propertyBrief;
    }

    /**
     * @return property_category
     */
    public String getPropertyCategory() {
        return propertyCategory;
    }

    /**
     * @param propertyCategory
     */
    public void setPropertyCategory(String propertyCategory) {
        this.propertyCategory = propertyCategory;
    }

    /**
     * 获取购入时间
     *
     * @return property_buy_time - 购入时间
     */
    public Date getPropertyBuyTime() {
        return propertyBuyTime;
    }

    /**
     * 设置购入时间
     *
     * @param propertyBuyTime 购入时间
     */
    public void setPropertyBuyTime(Date propertyBuyTime) {
        this.propertyBuyTime = propertyBuyTime;
    }

    /**
     * 获取资产的所属人
     *
     * @return property_belong - 资产的所属人
     */
    public String getPropertyBelong() {
        return propertyBelong;
    }

    /**
     * 设置资产的所属人
     *
     * @param propertyBelong 资产的所属人
     */
    public void setPropertyBelong(String propertyBelong) {
        this.propertyBelong = propertyBelong;
    }

    /**
     * 获取资产的原价值
     *
     * @return property_value_old - 资产的原价值
     */
    public String getPropertyValueOld() {
        return propertyValueOld;
    }

    /**
     * 设置资产的原价值
     *
     * @param propertyValueOld 资产的原价值
     */
    public void setPropertyValueOld(String propertyValueOld) {
        this.propertyValueOld = propertyValueOld;
    }

    /**
     * 获取资产的先价值
     *
     * @return property_value - 资产的先价值
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * 设置资产的先价值
     *
     * @param propertyValue 资产的先价值
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}