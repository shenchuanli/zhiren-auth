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
@TableName("AuthProgramAPIRelationship")
public class AuthProgramAPIRelationship extends Model<AuthProgramAPIRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ProgramAPIId;
    private String APIId;
    private String ProgramId;


    public String getProgramAPIId() {
        return ProgramAPIId;
    }

    public void setProgramAPIId(String ProgramAPIId) {
        this.ProgramAPIId = ProgramAPIId;
    }

    public String getAPIId() {
        return APIId;
    }

    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    public String getProgramId() {
        return ProgramId;
    }

    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    @Override
    protected Serializable pkVal() {
        return this.ProgramAPIId;
    }

    @Override
    public String toString() {
        return "AuthProgramAPIRelationship{" +
        "ProgramAPIId=" + ProgramAPIId +
        ", APIId=" + APIId +
        ", ProgramId=" + ProgramId +
        "}";
    }
}
