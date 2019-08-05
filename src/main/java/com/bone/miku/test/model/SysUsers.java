package com.bone.miku.test.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName SysUsers
 * @Description TODO
 * @Author HanGuojia
 * @Version 1.0
 * @Since 2019/7/24 21:36
 * @Modefied [XXXX年XX月XX日 XX人修改了XXX内容]
 **/
@TableName("sys_users")
public class SysUsers {
    @TableField(value="USER_NAME")
    private String userName;
    @TableId(value="USER_ID",type = IdType.UUID)
    private String userId;
    @TableField(value="USER_ACCOUNT")
    private String userAccount;
    @TableField(value="PASSWORD")
    private String password;
    @TableField(value="LOGIN_COUNT")
    private String loginCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
