package bhupen.in.ecomdashboard.repositories;

import bhupen.in.ecomdashboard.entity.EmployeeInformation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Repository
@Qualifier(value = "employeeInformationRepository")
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long> {

    EmployeeInformation findByPk(final String pk);
}
