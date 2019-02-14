package bhupen.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by BhupendraKumar on 7/10/18.
 */
@Entity
@Table(name="OrderRecieved",schema = "ecomDashApp")
public class OrderRecieved extends KeyEntity{

    private int orderReceived;
    private String dateReceived;

    public int getOrderReceived() {
        return orderReceived;
    }

    public void setOrderReceived(int orderReceived) {
        this.orderReceived = orderReceived;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }
}
