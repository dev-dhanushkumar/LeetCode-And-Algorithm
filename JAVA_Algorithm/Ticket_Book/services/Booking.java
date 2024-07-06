package Ticket_Book.services;

import Ticket_Book.models.*;
import Ticket_Book.services.*;

public class Booking {
  private EventDetails eventDetails;
  public Booking() {

  }

  public Booking(EventDetails eventDetails) {
    this.eventDetails = eventDetails;
  }

  public double calculateBookingCost(int noOfTickets) {

    return noOfTickets * eventDetails.getTicketPrice();
  }

} 
