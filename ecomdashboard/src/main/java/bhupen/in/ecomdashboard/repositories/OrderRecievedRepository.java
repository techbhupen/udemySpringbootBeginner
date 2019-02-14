package bhupen.in.ecomdashboard.repositories;

import bhupen.in.ecomdashboard.entity.CompanyRevenue;
import bhupen.in.ecomdashboard.entity.OrderRecieved;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Repository
@Qualifier(value = "orderRecievedRepository")
public interface OrderRecievedRepository extends JpaRepository<OrderRecieved,Long> {
}
