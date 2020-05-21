package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

/**
 * @author: bizy
 * @date: 2020/05/21 22:18
 */
public interface UserService {
    
    /**
    *@description: 通过openid来查询用户信息
    *@param: 
    *@return: 
    *@author: bizy
    *@date: 2020/5/21 22:19
    */
    UserInfo findByOpenid(String openid);
}
