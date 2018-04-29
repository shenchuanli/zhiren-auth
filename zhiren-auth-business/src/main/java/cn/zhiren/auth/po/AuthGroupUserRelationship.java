package cn.zhiren.auth.po;

public class AuthGroupUserRelationship {
    private String groupuserid;

    private String groupid;

    private String userid;

    public String getGroupuserid() {
        return groupuserid;
    }

    public void setGroupuserid(String groupuserid) {
        this.groupuserid = groupuserid == null ? null : groupuserid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}