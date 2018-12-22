package com.erp.common;

import com.erp.pojo.Employee;

import javax.servlet.http.HttpServletRequest;

public class RequestHolder {

    private static final ThreadLocal<Employee> EMPLOYEE_THREAD_LOCAL = new ThreadLocal<>();

    private static final ThreadLocal<HttpServletRequest> REQUEST_THREAD_LOCAL = new ThreadLocal<>();


    public static void  setEmployeeThreadLocal(Employee employee){
        EMPLOYEE_THREAD_LOCAL.set(employee);
    }

    public static void setRequestThreadLocal(HttpServletRequest request){
        REQUEST_THREAD_LOCAL.set(request);
    }

    public static Employee getEmployeeThreadLocal(){
        return  EMPLOYEE_THREAD_LOCAL.get();
    }

    public static HttpServletRequest getRequestThreadLocal(){
        return REQUEST_THREAD_LOCAL.get();
    }

    public static void removeThreadLocal(){
        EMPLOYEE_THREAD_LOCAL.remove();
        REQUEST_THREAD_LOCAL.remove();
    }
}
