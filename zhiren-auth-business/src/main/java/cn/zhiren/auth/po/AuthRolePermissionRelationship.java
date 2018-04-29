package cn.zhiren.auth.po;

public class AuthRolePermissionRelationship {
    private String rolepermissionid;

    private String roleid;

    private String permission;

    public String getRolepermissionid() {
        return rolepermissionid;
    }

    public void setRolepermissionid(String rolepermissionid) {
        this.rolepermissionid = rolepermissionid == null ? null : rolepermissionid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}