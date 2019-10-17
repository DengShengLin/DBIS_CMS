package com.itheima.domain;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author dsl
 * @date 2019/10/15 17:23
 * @description
 */
@Data
public class Department implements Serializable {

    private Integer departId;
    private String departmentName;


}
