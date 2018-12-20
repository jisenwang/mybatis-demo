package com.test.mybatis.entity;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private double salary;
    private Integer deptId;
}
