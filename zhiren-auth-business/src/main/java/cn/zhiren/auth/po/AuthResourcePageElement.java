package cn.zhiren.auth.po;

public class AuthResourcePageElement {
    private String pageelement;

    private String elementcode;

    private String elementname;

    public String getPageelement() {
        return pageelement;
    }

    public void setPageelement(String pageelement) {
        this.pageelement = pageelement == null ? null : pageelement.trim();
    }

    public String getElementcode() {
        return elementcode;
    }

    public void setElementcode(String elementcode) {
        this.elementcode = elementcode == null ? null : elementcode.trim();
    }

    public String getElementname() {
        return elementname;
    }

    public void setElementname(String elementname) {
        this.elementname = elementname == null ? null : elementname.trim();
    }
}