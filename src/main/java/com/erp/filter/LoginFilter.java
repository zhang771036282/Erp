package com.erp.filter;


import com.erp.common.RequestHolder;
import com.erp.pojo.Employee;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.debug("init:{}",filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.debug("doFilter:{},{},{}",request,response,chain);
        HttpServletRequest rq = (HttpServletRequest) request;
        HttpServletResponse rs = (HttpServletResponse) response;

        Employee employee = (Employee) rq.getSession().getAttribute("employee");
        if(employee == null){
            // 重定向登录页面
            rs.sendRedirect("/login.html");
            return;
        }

        RequestHolder.setEmployeeThreadLocal(employee);
        RequestHolder.setRequestThreadLocal(rq);

        chain.doFilter(rq,rs);
        return;

    }

    @Override
    public void destroy() {
        log.debug("destroy:{}","销毁");
    }
}
