package com.sunny.permission.service.serviceImpl;

import com.sunny.permission.Utils.MD5;
import com.sunny.permission.entry.ActiveUser;
import com.sunny.permission.entry.SysUser;
import com.sunny.permission.entry.SysUserExample;
import com.sunny.permission.exception.BaseException;
import com.sunny.permission.mapper.SysUserMapper;
import com.sunny.permission.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class SysServiceImpl implements SysService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public ActiveUser authenticat(String usercode, String password) {
        //根据用户账号查询该账号是否存在
        SysUser sysUser = this.findSysUserByUsercode(usercode);
        if(sysUser == null){
            throw new BaseException("用户账号不存在");
        }
        //说去用户密码，进行对比。数据库是MD5加密后的密码
        String password_db = sysUser.getPassword();
        //对页面输入的密码进行MD5加密
        String md5ofstr = new MD5().getMD5ofstr(password);
        if (password_db.equalsIgnoreCase(md5ofstr)){
            throw  new BaseException("密码错误");
        }
        ActiveUser activeUser = new ActiveUser();
        activeUser.setId(sysUser.getId());
        activeUser.setUsername(sysUser.getUsername());
        activeUser.setUsername(usercode);
        return activeUser;
    }

    /**
     * 根据账号查询用户
     * @param usercode
     * @return
     */
    @Override
    public SysUser findSysUserByUsercode(String usercode) {
        SysUserExample sysUserExample = getSysUserExample(usercode);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if(CollectionUtils.isEmpty(sysUsers)){
            return null;
        }
        return sysUsers.get(0);
    }

    private SysUserExample getSysUserExample(String usercode) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsercodeEqualTo(usercode);
        return sysUserExample;
    }
}
