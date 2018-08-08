package cn.zhiren.auth.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@TableName("AuthClient")
public class AuthClient extends Model<AuthClient> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String ClientId;
    private String ResourceIds;
    private Integer SecretRequired;
    private String ClientSecret;
    private Integer Scoped;
    private String Scope;
    private String AuthorizedGrantTypes;
    private String RegisteredRedirectUri;
    private Integer AccessTokenValiditySeconds;
    private Integer RefreshTokenValiditySeconds;
    private String AutoApprove;
    private String TenantID;


    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getResourceIds() {
        return ResourceIds;
    }

    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public Integer getSecretRequired() {
        return SecretRequired;
    }

    public void setSecretRequired(Integer SecretRequired) {
        this.SecretRequired = SecretRequired;
    }

    public String getClientSecret() {
        return ClientSecret;
    }

    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    public Integer getScoped() {
        return Scoped;
    }

    public void setScoped(Integer Scoped) {
        this.Scoped = Scoped;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public String getAuthorizedGrantTypes() {
        return AuthorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String AuthorizedGrantTypes) {
        this.AuthorizedGrantTypes = AuthorizedGrantTypes;
    }

    public String getRegisteredRedirectUri() {
        return RegisteredRedirectUri;
    }

    public void setRegisteredRedirectUri(String RegisteredRedirectUri) {
        this.RegisteredRedirectUri = RegisteredRedirectUri;
    }

    public Integer getAccessTokenValiditySeconds() {
        return AccessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(Integer AccessTokenValiditySeconds) {
        this.AccessTokenValiditySeconds = AccessTokenValiditySeconds;
    }

    public Integer getRefreshTokenValiditySeconds() {
        return RefreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(Integer RefreshTokenValiditySeconds) {
        this.RefreshTokenValiditySeconds = RefreshTokenValiditySeconds;
    }

    public String getAutoApprove() {
        return AutoApprove;
    }

    public void setAutoApprove(String AutoApprove) {
        this.AutoApprove = AutoApprove;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    protected Serializable pkVal() {
        return this.ClientId;
    }

    @Override
    public String toString() {
        return "AuthClient{" +
        "ClientId=" + ClientId +
        ", ResourceIds=" + ResourceIds +
        ", SecretRequired=" + SecretRequired +
        ", ClientSecret=" + ClientSecret +
        ", Scoped=" + Scoped +
        ", Scope=" + Scope +
        ", AuthorizedGrantTypes=" + AuthorizedGrantTypes +
        ", RegisteredRedirectUri=" + RegisteredRedirectUri +
        ", AccessTokenValiditySeconds=" + AccessTokenValiditySeconds +
        ", RefreshTokenValiditySeconds=" + RefreshTokenValiditySeconds +
        ", AutoApprove=" + AutoApprove +
        ", TenantID=" + TenantID +
        "}";
    }
}
