package bhupen.in.ecomdashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by BhupendraKumar on 7/10/18.
 */

@Entity
@Table(name="Company_Revenue",schema = "ecomDashApp")
public class CompanyRevenue extends KeyEntity{


    @Column(name="Revenue_Month", nullable = false)
    private String _month;

    @Column(name="revenue", nullable = false)
    private double revenue;

    @Column(name="expense")
    private double expense;

    @Column(name="margins")
    private double margins;


    public String get_month() {
        return _month;
    }

    public void set_month(String _month) {
        this._month = _month;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getMargins() {
        return margins;
    }

    public void setMargins(double margins) {
        this.margins = margins;
    }
}
