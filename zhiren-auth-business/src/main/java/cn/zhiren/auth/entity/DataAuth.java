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
@TableName("DataAuth")
public class DataAuth extends Model<DataAuth> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String DataAuthId;
    private String DataAuthCode;
    private String DataAuthName;
    private String TenantID;


    public String getDataAuthId() {
        return DataAuthId;
    }

    public void setDataAuthId(String DataAuthId) {
        this.DataAuthId = DataAuthId;
    }

    public String getDataAuthCode() {
        return DataAuthCode;
    }

    public void setDataAuthCode(String DataAuthCode) {
        this.DataAuthCode = DataAuthCode;
    }

    public String getDataAuthName() {
        return DataAuthName;
    }

    public void setDataAuthName(String DataAuthName) {
        this.DataAuthName = DataAuthName;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.DataAuthId;
    }

    @Override
    public String toString() {
        return "DataAuth{" +
        "DataAuthId=" + DataAuthId +
        ", DataAuthCode=" + DataAuthCode +
        ", DataAuthName=" + DataAuthName +
        ", TenantID=" + TenantID +
        "}";
    }
}
