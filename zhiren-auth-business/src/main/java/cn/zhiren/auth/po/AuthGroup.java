package cn.zhiren.auth.po;

public class AuthGroup {
    private String groupid;

    private String parentgroupid;

    private String groupname;

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getParentgroupid() {
        return parentgroupid;
    }

    public void setParentgroupid(String parentgroupid) {
        this.parentgroupid = parentgroupid == null ? null : parentgroupid.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }
}