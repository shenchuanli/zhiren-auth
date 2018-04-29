package cn.zhiren.auth.po;

public class AuthResourceMenu {
    private String menuid;

    private String parentmenuid;

    private String menuname;

    private String menuurl;

    private Integer isenabled;

    private Integer clienttype;

    private Integer orderno;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public String getParentmenuid() {
        return parentmenuid;
    }

    public void setParentmenuid(String parentmenuid) {
        this.parentmenuid = parentmenuid == null ? null : parentmenuid.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    public Integer getClienttype() {
        return clienttype;
    }

    public void setClienttype(Integer clienttype) {
        this.clienttype = clienttype;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }
}