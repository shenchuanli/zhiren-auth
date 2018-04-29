package cn.zhiren.auth.po;

public class AuthOperation {
    private String operationid;

    private String operationname;

    private String operationcode;

    private String parentoperationid;

    private String intercepturl;

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid == null ? null : operationid.trim();
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname == null ? null : operationname.trim();
    }

    public String getOperationcode() {
        return operationcode;
    }

    public void setOperationcode(String operationcode) {
        this.operationcode = operationcode == null ? null : operationcode.trim();
    }

    public String getParentoperationid() {
        return parentoperationid;
    }

    public void setParentoperationid(String parentoperationid) {
        this.parentoperationid = parentoperationid == null ? null : parentoperationid.trim();
    }

    public String getIntercepturl() {
        return intercepturl;
    }

    public void setIntercepturl(String intercepturl) {
        this.intercepturl = intercepturl == null ? null : intercepturl.trim();
    }
}