package com.sunny.permission.service;

import com.sunny.permission.entry.ActiveUser;
import com.sunny.permission.entry.SysPermission;
import com.sunny.permission.entry.SysUser;

import java.util.List;

public interface SysService {


/**
 * 根据用户输入的用户名和密码查询数据库
 * 存在，返回用户信息
 * 不存在，返回null
 */

    public ActiveUser authenticat(String usercode,String password);

    /**
     * 根据用户在行号查询用户信息
     */
    public SysUser findSysUserByUsercode(String usercode);

    /**
     * 获取拥有menu权限的用户
     */
    public List<SysPermission> findMenuListByUserId(String userId);

    public List<SysPermission> findPermissionByUserId(String  userId);
}
