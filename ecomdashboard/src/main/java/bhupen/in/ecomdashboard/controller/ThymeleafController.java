package bhupen.in.ecomdashboard.controller;

import bhupen.in.ecomdashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by BhupendraKumar on 7/11/18.
 */
@Controller
public class ThymeleafController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dashboard")
    public String getDashDetail(Model model) {

        /**
         * Populate Company Revenue Data
         */

        model.addAttribute("cr", dashboardService.getTodayRevenueDash());

        /**
         * Populate the Employees info
         */

        model.addAttribute("ei", dashboardService.getAllEmployee());
        return "/dashboard";
    }

}
