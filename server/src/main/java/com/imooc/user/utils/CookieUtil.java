package com.imooc.user.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: bizy
 * @date: 2020/05/25 20:16
 */
public class CookieUtil {


    /**
    *@description: 设置cookie
    *@param: 
    *@return: 
    *@author: bizy
    *@date: 2020/5/25 20:18
    */
    public static void set(HttpServletResponse response,
                           String name,
                           String value,
                           int maxAge) {
        Cookie cookie = new Cookie(name,value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }
}
