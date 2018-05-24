package cn.zhiren.auth.dto.AuthUserManager;

/**
 * Created by Solley
 * Description 用户查询参数dto
 * Created Time  2018/5/24.
 */
public class AuthUserQueryParameterDTO {

    private String displayname;

    private Integer page;

    private Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
}
