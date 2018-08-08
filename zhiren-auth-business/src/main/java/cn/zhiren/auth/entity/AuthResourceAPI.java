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
@TableName("AuthResourceAPI")
public class AuthResourceAPI extends Model<AuthResourceAPI> {

    private static final long serialVersionUID = 1L;

    @TableId
    private String APIId;
    private String APIName;
    private String APIURL;
    private Integer IsEnabled;
    private String APIAuth;


    public String getAPIId() {
        return APIId;
    }

    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    public String getAPIName() {
        return APIName;
    }

    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    public String getAPIURL() {
        return APIURL;
    }

    public void setAPIURL(String APIURL) {
        this.APIURL = APIURL;
    }

    public Integer getIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(Integer IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public String getAPIAuth() {
        return APIAuth;
    }

    public void setAPIAuth(String APIAuth) {
        this.APIAuth = APIAuth;
    }

    @Override
    protected Serializable pkVal() {
        return this.APIId;
    }

    @Override
    public String toString() {
        return "AuthResourceAPI{" +
        "APIId=" + APIId +
        ", APIName=" + APIName +
        ", APIURL=" + APIURL +
        ", IsEnabled=" + IsEnabled +
        ", APIAuth=" + APIAuth +
        "}";
    }
}
