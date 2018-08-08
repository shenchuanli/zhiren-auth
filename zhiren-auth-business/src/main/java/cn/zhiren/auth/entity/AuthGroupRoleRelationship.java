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
@TableName("AuthGroupRoleRelationship")
public class AuthGroupRoleRelationship extends Model<AuthGroupRoleRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String GroupRoleId;
    private String GroupId;
    private String RoleId;
    private String TenantID;


    public String getGroupRoleId() {
        return GroupRoleId;
    }

    public void setGroupRoleId(String GroupRoleId) {
        this.GroupRoleId = GroupRoleId;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.GroupRoleId;
    }

    @Override
    public String toString() {
        return "AuthGroupRoleRelationship{" +
        "GroupRoleId=" + GroupRoleId +
        ", GroupId=" + GroupId +
        ", RoleId=" + RoleId +
        ", TenantID=" + TenantID +
        "}";
    }
}
