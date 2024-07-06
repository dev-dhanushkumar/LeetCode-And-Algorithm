package models;

public class Category {
  public enum EventType {MOVIE, SPORTS, CONCERT}
  
  EventType eventType;
  category(EventType eventType) {
    this.eventType = eventType;
  }

  public  EventType  getEventType() {
    return this.eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }
}
