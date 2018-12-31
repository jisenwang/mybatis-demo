package com.test.mybatis.service.impl;

import com.test.mybatis.entity.Employee;
import com.test.mybatis.mapper.EmployeeMapper;
import com.test.mybatis.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
@Service
@Slf4j
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String,Object> getEmployeeById(Integer id) {
        Map<String, Object> map = new HashMap<>();

        List<Employee> employees = employeeMapper.getEmployees();
        map.put("list", employees);

        Employee employeeById = employeeMapper.getEmployeeById(id);
        map.put("one", employeeById);
        return map;
    }


}
