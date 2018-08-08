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
@TableName("AuthUserRoleRelationship")
public class AuthUserRoleRelationship extends Model<AuthUserRoleRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String RoleUserId;
    private String RoleId;
    private String UserId;


    public String getRoleUserId() {
        return RoleUserId;
    }

    public void setRoleUserId(String RoleUserId) {
        this.RoleUserId = RoleUserId;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    @Override
    protected Serializable pkVal() {
        return this.RoleId;
    }

    @Override
    public String toString() {
        return "AuthUserRoleRelationship{" +
        "RoleUserId=" + RoleUserId +
        ", RoleId=" + RoleId +
        ", UserId=" + UserId +
        "}";
    }
}
