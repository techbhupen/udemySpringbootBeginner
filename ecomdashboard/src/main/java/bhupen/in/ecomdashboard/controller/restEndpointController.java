package bhupen.in.ecomdashboard.controller;

import bhupen.in.ecomdashboard.entity.EmployeeInformation;
import bhupen.in.ecomdashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by BhupendraKumar on 7/11/18.
 */

@RestController
public class restEndpointController {


    @Autowired
    private DashboardService dashboardService;


    @RequestMapping("/employees")
    public List<EmployeeInformation> getAllEmp() {
        return dashboardService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee/add")
    public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation) {
        if (dashboardService.addEmployee(employeeInformation) != null) {
            return "Employee data saved successfully";
        } else {
            return "Error saving employee info";
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/delete")
    public String deleteEmp(@RequestParam(name = "empId", required = true) String pk) {
        try {
            dashboardService.deleteEmployee(dashboardService.getEmployee(pk));
            return "deleted";
        } catch (Exception e) {
            return "error";
        }
    }

}
