package bhupen.in.ecomdashboard.service;

import bhupen.in.ecomdashboard.entity.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
public interface DashboardService {

    HashMap<String,Object> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderRecieved> getAllOrderRecieved();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);

}
