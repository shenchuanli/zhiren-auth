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
@TableName("AuthGroupUserRelationship")
public class AuthGroupUserRelationship extends Model<AuthGroupUserRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String GroupUserId;
    private String UserId;
    private String GroupId;
    private String TenantID;


    public String getGroupUserId() {
        return GroupUserId;
    }

    public void setGroupUserId(String GroupUserId) {
        this.GroupUserId = GroupUserId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
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
        return this.GroupUserId;
    }

    @Override
    public String toString() {
        return "AuthGroupUserRelationship{" +
        "GroupUserId=" + GroupUserId +
        ", UserId=" + UserId +
        ", GroupId=" + GroupId +
        ", TenantID=" + TenantID +
        "}";
    }
}
