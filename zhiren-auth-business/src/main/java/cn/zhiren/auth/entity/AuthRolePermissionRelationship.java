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
@TableName("AuthRolePermissionRelationship")
public class AuthRolePermissionRelationship extends Model<AuthRolePermissionRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String RolePermissionId;
    private String RoleId;
    private String PermissionId;


    public String getRolePermissionId() {
        return RolePermissionId;
    }

    public void setRolePermissionId(String RolePermissionId) {
        this.RolePermissionId = RolePermissionId;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.RolePermissionId;
    }

    @Override
    public String toString() {
        return "AuthRolePermissionRelationship{" +
        "RolePermissionId=" + RolePermissionId +
        ", RoleId=" + RoleId +
        ", PermissionId=" + PermissionId +
        "}";
    }
}
