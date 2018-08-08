package cn.zhiren.auth.dto.AuthUserDTO;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
public class LoginResponseDTO {

    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
