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
@TableName("AuthTenant")
public class AuthTenant extends Model<AuthTenant> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String TenantID;
    private String TenantName;
    private String TenantCode;
    private Integer SuperTenant;

    public String getTenantCode() {
        return TenantCode;
    }

    public void setTenantCode(String tenantCode) {
        TenantCode = tenantCode;
    }
    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    public String getTenantName() {
        return TenantName;
    }

    public void setTenantName(String TenantName) {
        this.TenantName = TenantName;
    }

    public Integer getSuperTenant() {
        return SuperTenant;
    }

    public void setSuperTenant(Integer SuperTenant) {
        this.SuperTenant = SuperTenant;
    }

    @Override
    protected Serializable pkVal() {
        return this.TenantID;
    }

    @Override
    public String toString() {
        return "AuthTenant{" +
                "TenantID='" + TenantID + '\'' +
                ", TenantName='" + TenantName + '\'' +
                ", TenantCode='" + TenantCode + '\'' +
                ", SuperTenant=" + SuperTenant +
                '}';
    }
}
