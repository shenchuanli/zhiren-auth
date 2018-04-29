package cn.zhiren.auth.po;

public class AuthPermission {
    private String permissionid;

    private Integer permissiontype;

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public Integer getPermissiontype() {
        return permissiontype;
    }

    public void setPermissiontype(Integer permissiontype) {
        this.permissiontype = permissiontype;
    }
}