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
@TableName("AuthGroupClientRelationship")
public class AuthGroupClientRelationship extends Model<AuthGroupClientRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ClientId;
    private String GroupClientId;
    private String GroupId;
    private String TenantID;


    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getGroupClientId() {
        return GroupClientId;
    }

    public void setGroupClientId(String GroupClientId) {
        this.GroupClientId = GroupClientId;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.ClientId;
    }

    @Override
    public String toString() {
        return "AuthGroupClientRelationship{" +
        "ClientId=" + ClientId +
        ", GroupClientId=" + GroupClientId +
        ", GroupId=" + GroupId +
        ", TenantID=" + TenantID +
        "}";
    }
}
