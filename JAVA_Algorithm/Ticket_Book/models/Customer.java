package  Ticket_Book.models;

public class Customer {
  private String customerName;
  private String email;
  private String phoneNumber;

  public Customer() {

  }

  public Customer(String customerName, String email, String phoneNumber) {
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void displayCustomerDetails() {
   System.out.println("Customer Name: "+ this.getCustomerName());
   System.out.println("Customer Email: "+ this.getEmail());
   System.out.println("Customer Phone Numbers : "+ this.getPhoneNumber());
  }

}
