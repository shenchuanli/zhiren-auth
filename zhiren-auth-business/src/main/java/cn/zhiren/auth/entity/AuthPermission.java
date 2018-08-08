package cn.zhiren.auth.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@TableName("AuthPermission")
public class AuthPermission extends Model<AuthPermission> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionId;
    private Integer PermissionType;


    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    public Integer getPermissionType() {
        return PermissionType;
    }

    public void setPermissionType(Integer PermissionType) {
        this.PermissionType = PermissionType;
    }

    @Override
    protected Serializable pkVal() {
        return this.PermissionId;
    }

    @Override
    public String toString() {
        return "AuthPermission{" +
        "PermissionId=" + PermissionId +
        ", PermissionType=" + PermissionType +
        "}";
    }
}
