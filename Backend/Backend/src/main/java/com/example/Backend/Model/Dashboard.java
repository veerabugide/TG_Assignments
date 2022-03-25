package com.example.Backend.Model;

import org.springframework.stereotype.Component;

@Component
public class Dashboard {

    private String name;
    private double balance;
    private double todaysProfit;
    private int purchases;
    private int downloads;
    private int numberOfMeetings;
    private int numberOfClients;
    private int todaysBooking;
    private int totalItemsBooking;
    private int Revenue;
    private int Sales;
    private int Purchases;
    private double orderValue;
    private int orders;
    private double users;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTodaysProfit() {
        return todaysProfit;
    }

    public void setTodaysProfit(double todaysProfit) {
        this.todaysProfit = todaysProfit;
    }

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public int getNumberOfMeetings() {
        return numberOfMeetings;
    }

    public void setNumberOfMeetings(int numberOfMeetings) {
        this.numberOfMeetings = numberOfMeetings;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public int getTodaysBooking() {
        return todaysBooking;
    }

    public void setTodaysBooking(int todaysBooking) {
        this.todaysBooking = todaysBooking;
    }

    public int getTotalItemsBooking() {
        return totalItemsBooking;
    }

    public void setTotalItemsBooking(int totalItemsBooking) {
        this.totalItemsBooking = totalItemsBooking;
    }

    public int getRevenue() {
        return Revenue;
    }

    public void setRevenue(int revenue) {
        Revenue = revenue;
    }

    public int getSales() {
        return Sales;
    }

    public void setSales(int sales) {
        Sales = sales;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public double getUsers() {
        return users;
    }

    public void setUsers(double users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", todaysProfit=" + todaysProfit +
                ", purchases=" + purchases +
                ", downloads=" + downloads +
                ", numberOfMeetings=" + numberOfMeetings +
                ", numberOfClients=" + numberOfClients +
                ", todaysBooking=" + todaysBooking +
                ", totalItemsBooking=" + totalItemsBooking +
                ", Revenue=" + Revenue +
                ", Sales=" + Sales +
                ", Purchases=" + Purchases +
                ", orderValue=" + orderValue +
                ", orders=" + orders +
                ", users=" + users +
                '}';
    }
}

