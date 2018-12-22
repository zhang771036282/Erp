package com.erp.service;

import com.erp.dao.EmployeeMapper;
import com.erp.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private EmployeeMapper employeeMapper;


    /**
     * 登录(可以根据员工工号、员工姓名、员工电话)
     * @param value
     * @return
     */
    public Employee Login(String value){
        return employeeMapper.login(value);
    }
}
