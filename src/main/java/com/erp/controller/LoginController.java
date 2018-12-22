package com.erp.controller;

import com.erp.pojo.Employee;
import com.erp.service.LoginService;
import com.erp.utils.AjaxResult;
import com.erp.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

@Controller
@RequestMapping(value = "/login/*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录(可以根据员工工号、员工姓名、员工电话)
     * @param value
     * @param key
     * @param remember
     * @param response
     * @param request
     * @return
     * @throws Exception
     */
    public AjaxResult login(@RequestParam(value = "value") String value,
                            @RequestParam(value = "key") String key,
                            @RequestParam(value = "remember") boolean remember,
                            HttpServletResponse response, HttpServletRequest request) throws Exception{

        Employee employee = loginService.Login(value);

        if (StringUtils.isBlank(value)) {
            return AjaxResult.fail("账号不可为空");
        } else if (StringUtils.isBlank(key)) {
            return AjaxResult.fail("密码不可以为空");
        } else if (employee == null) {
            return AjaxResult.fail("抱歉！该账号不存在");
        } else if (!employee.getPassword().equals(MD5Util.encrypt(key))) {
            return AjaxResult.fail("账号密码错误");
        } else if (employee.getState() == 0){
            return AjaxResult.fail("账号已冻结，请联系管理员解冻");
        } else if (employee.getState() == 2){
            return AjaxResult.fail("该账号已经注销，请联系管理员重新注册");
        } else {
            request.getSession().setAttribute("employee",employee);

            // 组合登录信息
            String employeeInfo = value + "+" + key;
            // 设置登录信息编码
            employeeInfo = URLEncoder.encode(employeeInfo,"UTF-8");
            // 创建 Cookie
            Cookie userCookie = new Cookie("employeeInfo",employeeInfo);
            // 判断是否勾选记住密码
            if (remember){

                // 设置 Cookie 存活期限
                userCookie.setMaxAge(7*24*60*60);
                // 设置所有路径下共享 cookie
                userCookie.setPath("/");
                // 添加 cookie 到服务器响应中
                response.addCookie(userCookie);
            } else {

                // 设置 Cookie 存活期限
                userCookie.setMaxAge(0);
                // 设置所有路径下共享 cookie
                userCookie.setPath("/");
                // 添加 cookie 到服务器响应中
                response.addCookie(userCookie);
            }

            // 跳转后台页面
            return AjaxResult.success("验证成功");
        }
    }

    /**
     * 登出
     * @param session
     * @return
     */
    public String logout(HttpSession session) {
        session.invalidate();
        // 跳转登录页面
        return "/login.html";
    }
}
