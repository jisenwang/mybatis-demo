package com.test.mybatis.mapper;

import com.test.mybatis.entity.Employee;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    List<Employee> getEmployees();

    Boolean addEmployee(Employee employee);

    Boolean updateEmployee(Employee employee);

    Boolean deleteEmployee(Employee employee);
}
