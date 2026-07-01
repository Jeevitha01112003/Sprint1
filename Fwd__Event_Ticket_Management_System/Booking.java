public class Booking {

    private int bookingId;
    private int eventId;
    private String consumerId;
    private int tickets;
    private int totalAmount;

    public Booking() {

    }

    public Booking(int bookingId, int eventId,
                   String consumerId,
                   int tickets,
                   int totalAmount) {

        this.bookingId = bookingId;
        this.eventId = eventId;
        this.consumerId = consumerId;
        this.tickets = tickets;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public int getTickets() {
        return tickets;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void displayBooking() {

        System.out.println("Booking ID : " + bookingId);
        System.out.println("Consumer   : " + consumerId);
        System.out.println("Event ID   : " + eventId);
        System.out.println("Tickets    : " + tickets);
        System.out.println("Amount     : " + totalAmount);

    }

}