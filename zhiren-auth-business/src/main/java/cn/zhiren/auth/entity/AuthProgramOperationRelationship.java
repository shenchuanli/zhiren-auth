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
@TableName("AuthProgramOperationRelationship")
public class AuthProgramOperationRelationship extends Model<AuthProgramOperationRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ProgramOperationId;
    private String OperationId;
    private String ProgramId;


    public String getProgramOperationId() {
        return ProgramOperationId;
    }

    public void setProgramOperationId(String ProgramOperationId) {
        this.ProgramOperationId = ProgramOperationId;
    }

    public String getOperationId() {
        return OperationId;
    }

    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    public String getProgramId() {
        return ProgramId;
    }

    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    @Override
    protected Serializable pkVal() {
        return this.OperationId;
    }

    @Override
    public String toString() {
        return "AuthProgramOperationRelationship{" +
        "ProgramOperationId=" + ProgramOperationId +
        ", OperationId=" + OperationId +
        ", ProgramId=" + ProgramId +
        "}";
    }
}
