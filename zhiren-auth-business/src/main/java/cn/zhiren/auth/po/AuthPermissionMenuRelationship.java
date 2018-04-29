package cn.zhiren.auth.po;

public class AuthPermissionMenuRelationship {
    private String permissionmenuid;

    private String menuid;

    private String permissionid;

    public String getPermissionmenuid() {
        return permissionmenuid;
    }

    public void setPermissionmenuid(String permissionmenuid) {
        this.permissionmenuid = permissionmenuid == null ? null : permissionmenuid.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }
}