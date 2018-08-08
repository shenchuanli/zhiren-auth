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
@TableName("AuthPermissionDataAuthRelationship")
public class AuthPermissionDataAuthRelationship extends Model<AuthPermissionDataAuthRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionDataAuthId;
    private String DataAuthId;
    private String PermissionId;


    public String getPermissionDataAuthId() {
        return PermissionDataAuthId;
    }

    public void setPermissionDataAuthId(String PermissionDataAuthId) {
        this.PermissionDataAuthId = PermissionDataAuthId;
    }

    public String getDataAuthId() {
        return DataAuthId;
    }

    public void setDataAuthId(String DataAuthId) {
        this.DataAuthId = DataAuthId;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.DataAuthId;
    }

    @Override
    public String toString() {
        return "AuthPermissionDataAuthRelationship{" +
        "PermissionDataAuthId=" + PermissionDataAuthId +
        ", DataAuthId=" + DataAuthId +
        ", PermissionId=" + PermissionId +
        "}";
    }
}
