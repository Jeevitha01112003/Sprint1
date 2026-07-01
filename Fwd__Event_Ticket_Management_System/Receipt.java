public class Receipt {

    public static void printReceipt(Booking booking){

        System.out.println();

        System.out.println("========== RECEIPT ==========");

        System.out.println("Booking ID : "
                +booking.getBookingId());

        System.out.println("Event ID   : "
                +booking.getEventId());

        System.out.println("Consumer   : "
                +booking.getConsumerId());

        System.out.println("Tickets    : "
                +booking.getTickets());

        System.out.println("Amount Paid: ₹"
                +booking.getTotalAmount());

        System.out.println("=============================");

    }

}