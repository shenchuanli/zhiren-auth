package cn.zhiren.auth.dto.AuthResourceMenuDTO;

/**
 * create by: Solley
 * description:
 * create time: 16:35 2018/8/7
 *  * @Param: null
 * @return 
 */
public class MenuDTO {
    private String MenuName;
    private String MenuURL;
    private String Icon;
    private String MenuCode;

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public String getMenuURL() {
        return MenuURL;
    }

    public void setMenuURL(String menuURL) {
        MenuURL = menuURL;
    }

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

    public Integer getMenuType() {
        return MenuType;
    }

    public void setMenuType(Integer menuType) {
        MenuType = menuType;
    }

    private Integer MenuType;
}
