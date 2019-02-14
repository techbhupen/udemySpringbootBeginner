package bhupen.in.ecomdashboard.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@MappedSuperclass
public class KeyEntity {

    @Id
    @Column(name = "PK", unique = true)
    private String pk;

    public String getPk() {
        return pk;
    }


    public void setPk(String pk) {
        this.pk = pk;
    }
}
