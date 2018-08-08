package cn.zhiren.auth.dto.AuthUserDTO;

import cn.zhiren.auth.dto.AuthResourceMenuDTO.MenuDTO;
import cn.zhiren.auth.dto.AuthResourcePageElementDTO.ElementDTO;

import java.util.List;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 * Description 用户权限传输dto
 */
public class UserDTO {
    private String UserId;
    private String TenantID;
    private Integer TenanAdmin;
    private String Username;
    private String Displayname;
    public List<MenuDTO> menuDTOS;
    public List<String> roles;
    public List<ElementDTO> elementDTOS;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String tenantID) {
        TenantID = tenantID;
    }

    public Integer getTenanAdmin() {
        return TenanAdmin;
    }

    public void setTenanAdmin(Integer tenanAdmin) {
        TenanAdmin = tenanAdmin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getDisplayname() {
        return Displayname;
    }

    public void setDisplayname(String displayname) {
        Displayname = displayname;
    }

    public List<MenuDTO> getMenuDTOS() {
        return menuDTOS;
    }

    public void setMenuDTOS(List<MenuDTO> menuDTOS) {
        this.menuDTOS = menuDTOS;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<ElementDTO> getElementDTOS() {
        return elementDTOS;
    }

    public void setElementDTOS(List<ElementDTO> elementDTOS) {
        this.elementDTOS = elementDTOS;
    }
}
