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
@TableName("AuthPermissionAPIRelationship")
public class AuthPermissionAPIRelationship extends Model<AuthPermissionAPIRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionAPIId;
    private String PermissionId;
    private String APIId;


    public String getPermissionAPIId() {
        return PermissionAPIId;
    }

    public void setPermissionAPIId(String PermissionAPIId) {
        this.PermissionAPIId = PermissionAPIId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    public String getAPIId() {
        return APIId;
    }

    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    @Override
    protected Serializable pkVal() {
        return this.PermissionAPIId;
    }

    @Override
    public String toString() {
        return "AuthPermissionAPIRelationship{" +
        "PermissionAPIId=" + PermissionAPIId +
        ", PermissionId=" + PermissionId +
        ", APIId=" + APIId +
        "}";
    }
}
