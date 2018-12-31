package com.test.mybatis.controller;

import com.test.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
@RestController
public class HelloController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/indx/{id}")
    public Map<String,Object> get(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }
}
