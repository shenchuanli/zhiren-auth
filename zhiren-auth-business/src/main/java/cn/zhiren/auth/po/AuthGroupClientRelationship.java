package cn.zhiren.auth.po;

public class AuthGroupClientRelationship {
    private String groupclientid;

    private String clientid;

    private String groupid;

    public String getGroupclientid() {
        return groupclientid;
    }

    public void setGroupclientid(String groupclientid) {
        this.groupclientid = groupclientid == null ? null : groupclientid.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }
}