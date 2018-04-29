package cn.zhiren.auth.po;

public class AuthGroupRoleRelationship {
    private String grouproleid;

    private String groupid;

    private String roleid;

    public String getGrouproleid() {
        return grouproleid;
    }

    public void setGrouproleid(String grouproleid) {
        this.grouproleid = grouproleid == null ? null : grouproleid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}