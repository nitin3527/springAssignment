package com.practice.springAssignment;

import org.springframework.stereotype.Component;

@Component
public class AirTicket implements TravelMedium{
    public String travelTicket(String from, String to){
        System.out.println("AirTicket executed");
        return "flight booked from " + from + " to " + to;
    }
}

/*
Tight coupling
public class AirTicket{
    public String travelTicket(String from, String to){
        System.out.println("AirTicket executed");
        return "Air booked from " + from + " to " + to;
    }
}

 */