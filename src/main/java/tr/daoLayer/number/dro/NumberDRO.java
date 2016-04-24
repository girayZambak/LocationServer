package tr.daoLayer.number.dro;

import tr.util.classes.BaseDRO;

import java.util.Date;

public class NumberDRO extends BaseDRO {
    private Long id;
    private String number;
    private String areaCode;

    public NumberDRO(){

    }

    public NumberDRO(Long id, String areaCode, String number) {
        this.id = id;
        this.areaCode = areaCode;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
