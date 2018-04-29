package cn.zhiren.auth.po;

public class AuthClient {
    private String clientid;

    private String resourceids;

    private Boolean secretrequired;

    private String clientsecret;

    private Boolean scoped;

    private String scope;

    private String authorizedgranttypes;

    private String registeredredirecturi;

    private Integer accesstokenvalidityseconds;

    private Integer refreshtokenvalidityseconds;

    private String autoapprove;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getResourceids() {
        return resourceids;
    }

    public void setResourceids(String resourceids) {
        this.resourceids = resourceids == null ? null : resourceids.trim();
    }

    public Boolean getSecretrequired() {
        return secretrequired;
    }

    public void setSecretrequired(Boolean secretrequired) {
        this.secretrequired = secretrequired;
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret == null ? null : clientsecret.trim();
    }

    public Boolean getScoped() {
        return scoped;
    }

    public void setScoped(Boolean scoped) {
        this.scoped = scoped;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getAuthorizedgranttypes() {
        return authorizedgranttypes;
    }

    public void setAuthorizedgranttypes(String authorizedgranttypes) {
        this.authorizedgranttypes = authorizedgranttypes == null ? null : authorizedgranttypes.trim();
    }

    public String getRegisteredredirecturi() {
        return registeredredirecturi;
    }

    public void setRegisteredredirecturi(String registeredredirecturi) {
        this.registeredredirecturi = registeredredirecturi == null ? null : registeredredirecturi.trim();
    }

    public Integer getAccesstokenvalidityseconds() {
        return accesstokenvalidityseconds;
    }

    public void setAccesstokenvalidityseconds(Integer accesstokenvalidityseconds) {
        this.accesstokenvalidityseconds = accesstokenvalidityseconds;
    }

    public Integer getRefreshtokenvalidityseconds() {
        return refreshtokenvalidityseconds;
    }

    public void setRefreshtokenvalidityseconds(Integer refreshtokenvalidityseconds) {
        this.refreshtokenvalidityseconds = refreshtokenvalidityseconds;
    }

    public String getAutoapprove() {
        return autoapprove;
    }

    public void setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove == null ? null : autoapprove.trim();
    }
}