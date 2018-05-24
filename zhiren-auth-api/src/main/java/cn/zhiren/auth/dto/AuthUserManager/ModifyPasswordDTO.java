package cn.zhiren.auth.dto.AuthUserManager;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
public class ModifyPasswordDTO {
    private String userid;

    private String oldPassword;

    private String NewPassword;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }
}
