package cn.zhiren.auth.po;

public class AuthPermissionOperationRelationship {
    private String permissionoperation;

    private String permissionid;

    private String operationid;

    public String getPermissionoperation() {
        return permissionoperation;
    }

    public void setPermissionoperation(String permissionoperation) {
        this.permissionoperation = permissionoperation == null ? null : permissionoperation.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid == null ? null : operationid.trim();
    }
}