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
@TableName("AuthResourcePageElement")
public class AuthResourcePageElement extends Model<AuthResourcePageElement> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String PageElementId;
    private String ElementCode;
    private String ElementName;
    private String ElementType;


    public String getPageElementId() {
        return PageElementId;
    }

    public void setPageElementId(String PageElementId) {
        this.PageElementId = PageElementId;
    }

    public String getElementCode() {
        return ElementCode;
    }

    public void setElementCode(String ElementCode) {
        this.ElementCode = ElementCode;
    }

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    public String getElementType() {
        return ElementType;
    }

    public void setElementType(String ElementType) {
        this.ElementType = ElementType;
    }

    @Override
    protected Serializable pkVal() {
        return this.PageElementId;
    }

    @Override
    public String toString() {
        return "AuthResourcePageElement{" +
        "PageElementId=" + PageElementId +
        ", ElementCode=" + ElementCode +
        ", ElementName=" + ElementName +
        ", ElementType=" + ElementType +
        "}";
    }
}
