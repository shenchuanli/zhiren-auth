package cn.zhiren.auth.dto;

import java.io.Serializable;

/**
 * Created by Solley
 * Created Time  2018/4/11.
 */
public class DemoDTO implements Serializable {
    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
