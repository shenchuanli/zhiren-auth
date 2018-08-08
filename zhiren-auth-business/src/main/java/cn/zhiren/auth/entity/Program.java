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
@TableName("Program")
public class Program extends Model<Program> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ProgramId;
    private String ProgramCode;
    private String ProgramName;


    public String getProgramId() {
        return ProgramId;
    }

    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    public String getProgramCode() {
        return ProgramCode;
    }

    public void setProgramCode(String ProgramCode) {
        this.ProgramCode = ProgramCode;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    @Override
    protected Serializable pkVal() {
        return this.ProgramId;
    }

    @Override
    public String toString() {
        return "Program{" +
        "ProgramId=" + ProgramId +
        ", ProgramCode=" + ProgramCode +
        ", ProgramName=" + ProgramName +
        "}";
    }
}
