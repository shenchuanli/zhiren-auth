package cn.zhiren.auth.po;

import java.util.Date;

public class AuthUser {
    private String userid;

    private String username;

    private String displayname;

    private String password;

    private Boolean accountnonexpired;

    private Boolean accountnonlocked;

    private Boolean credentialsnonexpired;

    private Boolean isenabled;

    private Date createtime;

    private String email;

    private String phone;

    private String sex;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getAccountnonexpired() {
        return accountnonexpired;
    }

    public void setAccountnonexpired(Boolean accountnonexpired) {
        this.accountnonexpired = accountnonexpired;
    }

    public Boolean getAccountnonlocked() {
        return accountnonlocked;
    }

    public void setAccountnonlocked(Boolean accountnonlocked) {
        this.accountnonlocked = accountnonlocked;
    }

    public Boolean getCredentialsnonexpired() {
        return credentialsnonexpired;
    }

    public void setCredentialsnonexpired(Boolean credentialsnonexpired) {
        this.credentialsnonexpired = credentialsnonexpired;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}