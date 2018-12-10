package com.sunny.permission.entry;

import java.io.Serializable;

/**
 * 创建存储用户信息的专门类
 */
public class ActiveUser  implements Serializable {
    private String id;

    private String usercode;

    private String username;

    public ActiveUser() {
    }

    public ActiveUser(String id, String usercode, String username) {
        this.id = id;
        this.usercode = usercode;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
