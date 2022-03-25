package com.example.Backend.Controller;

import com.example.Backend.Model.Dashboard;
import com.example.Backend.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    DashboardService dashboardService;

    @Autowired
    Dashboard dashboard;

    @GetMapping(value = "/dashboard", produces = MediaType.APPLICATION_JSON_VALUE )
    public Dashboard getDashboard()
    {
        dashboard=dashboardService.getDashboard();
       return dashboard;
    }
}
