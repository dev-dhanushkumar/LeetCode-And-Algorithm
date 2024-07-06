package Ticket_Book.models;


public class EventDetails {
  private String eventName;
  private String eventDate;
  private String eventTime;
  private String venueName;
  private int totalSeats;
  private int availableSeat;
  private double ticketPrice; 

  public EventDetails() {

  }
  
  public EventDetails(String eventName, String eventDate, String eventTime, String venueName, int totalSeats, int availableSeat, double ticketPrice) {
    this.eventName = eventName;
    this.eventDate = eventDate;
    this.eventTime = eventTime;
    this.venueName = venueName;
    this.totalSeats = totalSeats;
    this.availableSeat = availableSeat;
    this.ticketPrice = ticketPrice;
  }

  public String getEventName() {
    return this.eventName;
  }

  public String getEventDate() {
    return this.eventDate;
  }

  public String getEventTime() {
    return this.eventTime;
  }

  public String getVenueName() {
    return this.venueName;
  }

  public int getTotalSeats() {
    return this.totalSeats;
  }

  public int getAvailableSeats() {
    return this.availableSeat;
  }

  public double getTicketPrice() {
    return this.ticketPrice;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public void setvenueName(String venueName) {
    this.venueName = venueName;
  }

  public void setTotalSeats(int totalSeats) {
    this.totalSeats = totalSeats;
  }

  public void setAvailableSeats(int availableSeat) {
    this.availableSeat = availableSeat;
  }

  public void setTicketPrice(double ticketPrice) {
    this.ticketPrice = ticketPrice;
  } 
}
