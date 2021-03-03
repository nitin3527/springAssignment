package com.practice.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookTicketImpl {

    @Autowired
    TravelMedium travelMedium;

    // constructor injection
    BookTicketImpl(TravelMedium tm){
        this.travelMedium = tm;
    }
    public String bookTicket(String from, String to){
        String tic = travelMedium.travelTicket(from, to);
        System.out.println(travelMedium);
        return tic;
        /*
        Tight coupling
        TrainTicket bookTicket = new TrainTicket();
        String tic = bookTicket.travelTicket(from, to);
        return tic;
         */
    }
}
