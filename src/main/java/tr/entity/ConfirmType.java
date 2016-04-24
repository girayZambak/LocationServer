package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIRM_TYPE", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "CONFIRM_TYPE_SEQ", allocationSize = 1)
public class ConfirmType extends BaseEntity {
    @Column(name="DEFINITION")
    private String definition;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
