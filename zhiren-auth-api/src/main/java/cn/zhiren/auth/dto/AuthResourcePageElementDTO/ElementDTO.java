package cn.zhiren.auth.dto.AuthResourcePageElementDTO;

/**
 * create by: Solley
 * description:
 * create time: 16:28 2018/8/7
 *  * @Param: null
 * @return 
 */
public class ElementDTO {

    private String ElementCode;
    private String ElementName;
    private String ElementType;

    public String getElementCode() {
        return ElementCode;
    }

    public void setElementCode(String elementCode) {
        ElementCode = elementCode;
    }

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String elementName) {
        ElementName = elementName;
    }

    public String getElementType() {
        return ElementType;
    }

    public void setElementType(String elementType) {
        ElementType = elementType;
    }
}
