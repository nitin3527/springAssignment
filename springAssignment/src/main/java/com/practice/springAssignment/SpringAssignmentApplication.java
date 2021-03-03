package com.practice.springAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssignmentApplication.class, args);
		//String res = ticket.bookTicket("delhi", "mumbai"); ->Tight coupling

		//loose coupling
		//BookTicketImpl ticket = new BookTicketImpl(new TrainTicket());
		ApplicationContext applicationContext = SpringApplication.run(SpringAssignmentApplication.class, args);
		BookTicketImpl ticket = applicationContext.getBean(BookTicketImpl.class);
		String res = ticket.bookTicket("delhi", "mumbai");
		System.out.println(res);
	}

}
