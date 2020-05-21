package com.imooc.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: bizy
 * @date: 2020/05/21 22:12
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String Id;

    private String username;

    private String password;

    private String openid;

    private Integer role;

}
