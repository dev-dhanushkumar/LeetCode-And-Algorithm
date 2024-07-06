package Ticket_Book.models;

public class Venue {
  private String venue_name;
  private String address;

  public Venue() {
    
  }

  public Venue(String venue_name, String address) {
    this.venue_name = venue_name;
    this.address = address;
  }

  public String getVenueName() {
    return this.venue_name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setVenueName(String venue_name) {
    this.venue_name = venue_name;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public void DisplayVenueDetails() {
    System.out.println("event Venue Place: "+ this.getVenueName());
    System.out.println("Event address:"+ this.getAddress());
  }
}
