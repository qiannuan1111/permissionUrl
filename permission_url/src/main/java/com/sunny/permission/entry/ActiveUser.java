package com.sunny.permission.entry;

import java.io.Serializable;
import java.util.List;

/**
 * 创建存储用户信息的专门类
 */
public class ActiveUser  implements Serializable {
    private String id;

    private String usercode;

    private String username;

    private List<SysPermission> menus;

    private List<SysPermission> permissions;

    public ActiveUser() {
    }

    public ActiveUser(String id, String usercode, String username) {
        this.id = id;
        this.usercode = usercode;
        this.username = username;
    }

    public ActiveUser(String id, String usercode, String username, List<SysPermission> menus, List<SysPermission> permissions) {
        this.id = id;
        this.usercode = usercode;
        this.username = username;
        this.menus = menus;
        this.permissions = permissions;
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

    public List<SysPermission> getMenus() {
        return menus;
    }

    public void setMenus(List<SysPermission> menus) {
        this.menus = menus;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }
}
