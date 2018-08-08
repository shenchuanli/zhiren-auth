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
@TableName("AuthPermissionPageElementRelationship")
public class AuthPermissionPageElementRelationship extends Model<AuthPermissionPageElementRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionPageElementId;
    private String PageElementId;
    private String PermissionId;


    public String getPermissionPageElementId() {
        return PermissionPageElementId;
    }

    public void setPermissionPageElementId(String PermissionPageElementId) {
        this.PermissionPageElementId = PermissionPageElementId;
    }

    public String getPageElementId() {
        return PageElementId;
    }

    public void setPageElementId(String PageElementId) {
        this.PageElementId = PageElementId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.PermissionPageElementId;
    }

    @Override
    public String toString() {
        return "AuthPermissionPageElementRelationship{" +
        "PermissionPageElementId=" + PermissionPageElementId +
        ", PageElementId=" + PageElementId +
        ", PermissionId=" + PermissionId +
        "}";
    }
}
