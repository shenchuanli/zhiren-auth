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
@TableName("AuthPermissionMenuRelationship")
public class AuthPermissionMenuRelationship extends Model<AuthPermissionMenuRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionMenuId;
    private String MenuId;
    private String PermissionId;


    public String getPermissionMenuId() {
        return PermissionMenuId;
    }

    public void setPermissionMenuId(String PermissionMenuId) {
        this.PermissionMenuId = PermissionMenuId;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.PermissionMenuId;
    }

    @Override
    public String toString() {
        return "AuthPermissionMenuRelationship{" +
        "PermissionMenuId=" + PermissionMenuId +
        ", MenuId=" + MenuId +
        ", PermissionId=" + PermissionId +
        "}";
    }
}
