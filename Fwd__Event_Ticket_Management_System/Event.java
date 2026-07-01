public class Event {

    private int eventId;
    private String eventName;
    private String eventDate;
    private String eventTime;
    private int ticketPrice;
    private int totalSeats;
    private int availableSeats;
    private String locationName;
    private String managerId;
    private String status;

    public Event() {

    }

    public Event(int eventId, String eventName, String eventDate,
                 String eventTime, int ticketPrice,
                 int totalSeats, String locationName,
                 String managerId, String status) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.locationName = locationName;
        this.managerId = managerId;
        this.status = status;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayEvent() {

        System.out.println("-----------------------------------");
        System.out.println("Event ID        : " + eventId);
        System.out.println("Event Name      : " + eventName);
        System.out.println("Date            : " + eventDate);
        System.out.println("Time            : " + eventTime);
        System.out.println("Location        : " + locationName);
        System.out.println("Ticket Price    : " + ticketPrice);
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Available Seats : " + availableSeats);
        System.out.println("Manager         : " + managerId);
        System.out.println("Status          : " + status);
        System.out.println("-----------------------------------");

    }

}