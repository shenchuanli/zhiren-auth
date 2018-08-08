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
@TableName("AuthClientRoleRelationship")
public class AuthClientRoleRelationship extends Model<AuthClientRoleRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ClientRoleId;
    private String ClientId;
    private String RoleId;


    public String getClientRoleId() {
        return ClientRoleId;
    }

    public void setClientRoleId(String ClientRoleId) {
        this.ClientRoleId = ClientRoleId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.ClientRoleId;
    }

    @Override
    public String toString() {
        return "AuthClientRoleRelationship{" +
        "ClientRoleId=" + ClientRoleId +
        ", ClientId=" + ClientId +
        ", RoleId=" + RoleId +
        "}";
    }
}
