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
@TableName("AuthResourceMenu")
public class AuthResourceMenu extends Model<AuthResourceMenu> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String MenuId;
    private String ParentMenuId;
    private String MenuName;
    private String MenuURL;
    private String Icon;
    private String MenuCode;
    private Integer IsEnabled;
    private Integer OrderNo;
    private Integer MenuType;
    private String ProgramId;

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getMenuCode() {
        return MenuCode;
    }

    public void setMenuCode(String menuCode) {
        MenuCode = menuCode;
    }
    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getParentMenuId() {
        return ParentMenuId;
    }

    public void setParentMenuId(String ParentMenuId) {
        this.ParentMenuId = ParentMenuId;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public String getMenuURL() {
        return MenuURL;
    }

    public void setMenuURL(String MenuURL) {
        this.MenuURL = MenuURL;
    }

    public Integer getIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(Integer IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public Integer getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(Integer OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getMenuType() {
        return MenuType;
    }

    public void setMenuType(Integer MenuType) {
        this.MenuType = MenuType;
    }

    public String getProgramId() {
        return ProgramId;
    }

    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    @Override
    protected Serializable pkVal() {
        return this.MenuId;
    }

    @Override
    public String toString() {
        return "AuthResourceMenu{" +
        "MenuId=" + MenuId +
        ", ParentMenuId=" + ParentMenuId +
        ", MenuName=" + MenuName +
        ", MenuURL=" + MenuURL +
        ", IsEnabled=" + IsEnabled +
        ", OrderNo=" + OrderNo +
        ", MenuType=" + MenuType +
        ", ProgramId=" + ProgramId +
        "}";
    }
}
