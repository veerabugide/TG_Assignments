package com.example.Backend.service;

import com.example.Backend.Model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DashboardService {

    @Autowired
    Dashboard dashboard;

    public Dashboard getDashboard(){

        dashboard.setName("vasanth");
        dashboard.setBalance(40079.60);
        dashboard.setTodaysProfit(175.00);
        dashboard.setPurchases(4006);
        dashboard.setDownloads(4006);
        dashboard.setNumberOfMeetings(34040);
        dashboard.setNumberOfClients(47033);
        dashboard.setTodaysBooking(40016);
        dashboard.setTotalItemsBooking(61344);
        dashboard.setRevenue(34040);
        dashboard.setSales(9672471);
        dashboard.setPurchases(6358);
        dashboard.setOrderValue(12.3);
        dashboard.setOrders(14);
        dashboard.setUsers(71.56);

        return dashboard;
    }
}
