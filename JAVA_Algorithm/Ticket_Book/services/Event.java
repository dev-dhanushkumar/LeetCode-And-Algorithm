package Ticket_Book.services;
import Ticket_Book.models.*;

public class Event{
  private EventDetails evObj;

  public Event() {

  }

  public Event(EventDetails evObj){
    this.evObj = evObj;
  }
  //EventDetails evObj = new EventDetails();
  public double calculateTotalRevenue() {
    return (evObj.getAvailableSeats() * evObj.getTicketPrice());
  }

  public int getBookedNoOfTicktes() {
    return evObj.getTotalSeats() - evObj.getAvailableSeats();
  }

  public void bookTickets(int noOfTickets) {
    if(noOfTickets <= evObj.getAvailableSeats()) {
      int seats = evObj.getAvailableSeats() - noOfTickets;
      evObj.setAvailableSeats(seats);
      System.out.println("Ticket Book Successfully Completed!");
      
    } else {
      System.out.println("Oops!, Tickets are not available.");
    }
  }

  public void cancelBooking(int noOfTickets) {
    if(noOfTickets > 0 && noOfTickets < evObj.getTotalSeats()) {
      int seats = evObj.getAvailableSeats() + noOfTickets;
      evObj.setAvailableSeats(seats);
      System.out.println("Ticket Cancel Successfully");
    } else {
      System.out.println("Please enter the proper count of Tickes!");
    }
  }

  public void displayEventDetails() {
    System.out.println("Event Name: "+ evObj.getEventName());
    System.out.println("Event Date: "+ evObj.getEventDate());
    
    System.out.println("Event Time: "+ evObj.getEventTime());

    System.out.println("Event Venue Name: "+ evObj.getVenueName());
    System.out.println("Event Total seats: "+ evObj.getTotalSeats());
    System.out.println("Ebent Available seats: "+ evObj.getAvailableSeats());
  }
}
