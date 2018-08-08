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
@TableName("AuthOperation")
public class AuthOperation extends Model<AuthOperation> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String OperationId;
    private String ParentOperationId;
    private String OperationName;
    private String OperationCode;
    private String InterceptURL;


    public String getOperationId() {
        return OperationId;
    }

    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    public String getParentOperationId() {
        return ParentOperationId;
    }

    public void setParentOperationId(String ParentOperationId) {
        this.ParentOperationId = ParentOperationId;
    }

    public String getOperationName() {
        return OperationName;
    }

    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    public String getOperationCode() {
        return OperationCode;
    }

    public void setOperationCode(String OperationCode) {
        this.OperationCode = OperationCode;
    }

    public String getInterceptURL() {
        return InterceptURL;
    }

    public void setInterceptURL(String InterceptURL) {
        this.InterceptURL = InterceptURL;
    }

    @Override
    protected Serializable pkVal() {
        return this.OperationId;
    }

    @Override
    public String toString() {
        return "AuthOperation{" +
        "OperationId=" + OperationId +
        ", ParentOperationId=" + ParentOperationId +
        ", OperationName=" + OperationName +
        ", OperationCode=" + OperationCode +
        ", InterceptURL=" + InterceptURL +
        "}";
    }
}
