package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "NUMBER", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "NUMBER_SEQ", allocationSize = 1)
public class Number extends BaseEntity {
    @Column(name="NUMBER")
    private String number;

    @Column(name="AREA_CODE")
    private String areaCode;

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
