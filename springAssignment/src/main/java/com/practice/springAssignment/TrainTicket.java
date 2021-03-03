package com.practice.springAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrainTicket implements TravelMedium{
    public String travelTicket(String from, String to){
        System.out.println("TrainTicket executed");
        return "Train booked from " + from + " to " + to;
    }
}
/*
============ tight coupling

public class TrainTicket{
    public String travelTicket(String from, String to){
        System.out.println("TrainTicket executed");
        return "flight booked from " + from + " to " + to;
    }
}
 */