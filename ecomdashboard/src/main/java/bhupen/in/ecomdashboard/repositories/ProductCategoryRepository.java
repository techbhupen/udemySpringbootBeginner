package bhupen.in.ecomdashboard.repositories;

import bhupen.in.ecomdashboard.entity.CompanyRevenue;
import bhupen.in.ecomdashboard.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Repository
@Qualifier(value = "productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

    List<ProductCategory> findByBestCategory(boolean bestCategory);
}
