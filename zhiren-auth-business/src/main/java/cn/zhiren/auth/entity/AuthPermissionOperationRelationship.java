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
@TableName("AuthPermissionOperationRelationship")
public class AuthPermissionOperationRelationship extends Model<AuthPermissionOperationRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PermissionOperation;
    private String PermissionId;
    private String OperationId;


    public String getPermissionOperation() {
        return PermissionOperation;
    }

    public void setPermissionOperation(String PermissionOperation) {
        this.PermissionOperation = PermissionOperation;
    }

    public String getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(String PermissionId) {
        this.PermissionId = PermissionId;
    }

    public String getOperationId() {
        return OperationId;
    }

    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    @Override
    protected Serializable pkVal() {
        return this.PermissionOperation;
    }

    @Override
    public String toString() {
        return "AuthPermissionOperationRelationship{" +
        "PermissionOperation=" + PermissionOperation +
        ", PermissionId=" + PermissionId +
        ", OperationId=" + OperationId +
        "}";
    }
}
