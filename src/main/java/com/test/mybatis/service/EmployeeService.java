package com.test.mybatis.service;

import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
public interface EmployeeService {

    Map<String,Object> getEmployeeById(Integer id);
}
