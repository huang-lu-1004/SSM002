package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "user")
public class User {
    @TableId(value = "uid",type = IdType.AUTO)
    private int uid;
    @TableField(value = "uname")
    private String uname;
    @TableField(value = "realname")
    private String realname;
    @TableField(value = "password")
    private String password;
    @TableField(value = "flag")
    private String flag;
}
