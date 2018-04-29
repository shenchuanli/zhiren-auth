package cn.zhiren.auth.po;

public class AuthPermissionPageElementRelationship {
    private String permissionpageelementid;

    private String permissionid;

    private String pageelementid;

    public String getPermissionpageelementid() {
        return permissionpageelementid;
    }

    public void setPermissionpageelementid(String permissionpageelementid) {
        this.permissionpageelementid = permissionpageelementid == null ? null : permissionpageelementid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public String getPageelementid() {
        return pageelementid;
    }

    public void setPageelementid(String pageelementid) {
        this.pageelementid = pageelementid == null ? null : pageelementid.trim();
    }
}