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
@TableName("AuthProgramDataAuthRelationship")
public class AuthProgramDataAuthRelationship extends Model<AuthProgramDataAuthRelationship> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ProgramDataAuthId;
    private String DataAuthId;
    private String ProgramId;


    public String getProgramDataAuthId() {
        return ProgramDataAuthId;
    }

    public void setProgramDataAuthId(String ProgramDataAuthId) {
        this.ProgramDataAuthId = ProgramDataAuthId;
    }

    public String getDataAuthId() {
        return DataAuthId;
    }

    public void setDataAuthId(String DataAuthId) {
        this.DataAuthId = DataAuthId;
    }

    public String getProgramId() {
        return ProgramId;
    }

    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    @Override
    protected Serializable pkVal() {
        return this.DataAuthId;
    }

    @Override
    public String toString() {
        return "AuthProgramDataAuthRelationship{" +
        "ProgramDataAuthId=" + ProgramDataAuthId +
        ", DataAuthId=" + DataAuthId +
        ", ProgramId=" + ProgramId +
        "}";
    }
}
