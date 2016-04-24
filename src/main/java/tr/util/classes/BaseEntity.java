package tr.util.classes;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "DEFAULT_ID_GENERATOR"
    )
    protected Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "CREATE_DATE"
    )
    protected Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "UPDATE_DATE"
    )
    protected Date updateDate;
    @Column(
            name = "DELETED",
            insertable = false
    )
    protected Boolean deleted;
    @Column(
            name = "UPDATED_USER"
    )
    protected String islemYapanKullanici;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getIslemYapanKullanici() {
        return islemYapanKullanici;
    }

    public void setIslemYapanKullanici(String islemYapanKullanici) {
        this.islemYapanKullanici = islemYapanKullanici;
    }
}
