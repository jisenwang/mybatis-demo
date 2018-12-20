package com.test.mybatis.mapper;

import com.test.mybatis.entity.Employee;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author Wangchenghong
 * @Date 2018/12/21
 */
@Repository
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);
}
