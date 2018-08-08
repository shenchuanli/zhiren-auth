package cn.zhiren.auth.dto.AuthUserDTO;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
public class LoginRequestDTO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
