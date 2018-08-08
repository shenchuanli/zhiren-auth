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
@TableName("AuthGroup")
public class AuthGroup extends Model<AuthGroup> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String GroupId;
    private String ParentGroupId;
    private String GroupName;
    private Integer GroupType;
    private String TenantID;


    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getParentGroupId() {
        return ParentGroupId;
    }

    public void setParentGroupId(String ParentGroupId) {
        this.ParentGroupId = ParentGroupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public Integer getGroupType() {
        return GroupType;
    }

    public void setGroupType(Integer GroupType) {
        this.GroupType = GroupType;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.GroupId;
    }

    @Override
    public String toString() {
        return "AuthGroup{" +
        "GroupId=" + GroupId +
        ", ParentGroupId=" + ParentGroupId +
        ", GroupName=" + GroupName +
        ", GroupType=" + GroupType +
        ", TenantID=" + TenantID +
        "}";
    }
}
