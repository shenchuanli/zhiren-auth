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
@TableName("AuthUser")
public class AuthUser extends Model<AuthUser> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String UserId;
    private String TenantID;
    private Integer TenanAdmin;
    private String Username;
    private String Displayname;


    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    public Integer getTenanAdmin() {
        return TenanAdmin;
    }

    public void setTenanAdmin(Integer TenanAdmin) {
        this.TenanAdmin = TenanAdmin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getDisplayname() {
        return Displayname;
    }

    public void setDisplayname(String Displayname) {
        this.Displayname = Displayname;
    }

    @Override
    protected Serializable pkVal() {
        return this.UserId;
    }

    @Override
    public String toString() {
        return "AuthUser{" +
        "UserId=" + UserId +
        ", TenantID=" + TenantID +
        ", TenanAdmin=" + TenanAdmin +
        ", Username=" + Username +
        ", Displayname=" + Displayname +
        "}";
    }
}
