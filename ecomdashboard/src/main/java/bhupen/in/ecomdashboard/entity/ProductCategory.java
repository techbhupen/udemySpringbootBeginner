package bhupen.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by BhupendraKumar on 7/10/18.
 */
@Entity
@Table(name="ProductCategory",schema = "ecomDashApp")
public class ProductCategory extends KeyEntity{


    private String categoryName;
    private int percentage;
    private boolean bestCategory;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isBestCategory() {
        return bestCategory;
    }

    public void setBestCategory(boolean bestCategory) {
        this.bestCategory = bestCategory;
    }
}
