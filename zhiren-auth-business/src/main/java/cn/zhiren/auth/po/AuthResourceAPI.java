package cn.zhiren.auth.po;

public class AuthResourceAPI {
    private String apiid;

    private String apiname;

    private String apiurl;

    private Integer isenabled;

    private String apiauth;

    public String getApiid() {
        return apiid;
    }

    public void setApiid(String apiid) {
        this.apiid = apiid == null ? null : apiid.trim();
    }

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname == null ? null : apiname.trim();
    }

    public String getApiurl() {
        return apiurl;
    }

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl == null ? null : apiurl.trim();
    }

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    public String getApiauth() {
        return apiauth;
    }

    public void setApiauth(String apiauth) {
        this.apiauth = apiauth == null ? null : apiauth.trim();
    }
}