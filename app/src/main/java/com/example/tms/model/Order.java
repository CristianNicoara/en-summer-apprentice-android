package com.example.tms.model;

public class Order {
    private Integer orderNumber;
    private String eventName;
    private String ticketCategory;
    private String orderTime;
    private Integer numberOfTickets;
    private Double totalPrice;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order(Integer orderNumber, String eventName, String ticketCategory, String orderTime, Integer numberOfTickets, Double totalPrice) {
        this.orderNumber = orderNumber;
        this.eventName = eventName;
        this.ticketCategory = ticketCategory;
        this.orderTime = orderTime;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(String ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
