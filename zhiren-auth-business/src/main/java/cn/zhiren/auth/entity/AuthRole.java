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
@TableName("AuthRole")
public class AuthRole extends Model<AuthRole> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String RoleId;
    private String RoleCode;
    private String RoleName;
    private Integer IsEnabled;
    private String TenantID;


    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public String getRoleCode() {
        return RoleCode;
    }

    public void setRoleCode(String RoleCode) {
        this.RoleCode = RoleCode;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public Integer getIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(Integer IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.RoleId;
    }

    @Override
    public String toString() {
        return "AuthRole{" +
        "RoleId=" + RoleId +
        ", RoleCode=" + RoleCode +
        ", RoleName=" + RoleName +
        ", IsEnabled=" + IsEnabled +
        ", TenantID=" + TenantID +
        "}";
    }
}
