package Ticket_Book;

import java.util.*;
import Ticket_Book.models.*;
import Ticket_Book.services.*;

public class Main{
  public static void main(String[] args) {
    EventDetails ed = new EventDetails();
    Venue v = new Venue();
    Customer cus = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Event Name: ");
    ed.setEventName(sc.nextLine());
    System.out.print("Enter Event date: ");
    ed.setEventDate(sc.nextLine());
    System.out.print("Enter Event Time: ");
    ed.setEventTime(sc.nextLine());
    System.out.print("Enter Event Place: ");
    ed.setvenueName(sc.nextLine());
    v.setVenueName(ed.getVenueName());
    System.out.print("Enter Event Venue Address: ");
    v.setAddress(sc.nextLine());
    System.out.print("Enter Total Seats: ");
    int seats = sc.nextInt();
    ed.setTotalSeats(seats);
    ed.setAvailableSeats(seats);
    System.out.print("Enter ticket Price: ");
    ed.setTicketPrice(sc.nextDouble());


    Event e = new Event(ed);
    
    e.displayEventDetails();

    System.out.println("Enter Customer Details Below:");
    System.out.print("Enter Customer email: ");
    cus.setEmail(sc.next());
    System.out.print("Enter Customer PhoneNumber: ");
    cus.setPhoneNumber(sc.next());
    System.out.print("Enter Customer Name:");
    cus.setCustomerName(sc.next());
    cus.displayCustomerDetails();

    System.out.println();
    System.out.println("Welcome to Ticket Booking!");
    System.out.println("Enter no of Tickets: ");
    e.bookTickets(sc.nextInt());
     System.out.println();
    e.displayEventDetails();

    System.out.println();
    

    System.out.println("Venue Details:");
    v.DisplayVenueDetails();
    
    Booking bk  = new Booking(ed);
    System.out.println("Revenue of Tickets: "+ bk.calculateBookingCost(10));
  }
}
