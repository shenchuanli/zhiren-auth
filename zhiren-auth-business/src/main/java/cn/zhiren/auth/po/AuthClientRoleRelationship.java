package cn.zhiren.auth.po;

public class AuthClientRoleRelationship {
    private String clientroleid;

    private String clientid;

    private String roleid;

    public String getClientroleid() {
        return clientroleid;
    }

    public void setClientroleid(String clientroleid) {
        this.clientroleid = clientroleid == null ? null : clientroleid.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}