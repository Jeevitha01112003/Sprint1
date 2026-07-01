import java.util.Scanner;

public class ConsumerService {

    Scanner sc = new Scanner(System.in);

    public void viewEvents() {

        boolean found=false;

        for(Event e:Database.events){

            if(e.getStatus().equalsIgnoreCase("Approved")){

                e.displayEvent();
                found=true;

            }

        }

        if(!found)

            System.out.println("No Approved Events.");

    }

    public void bookTicket(String consumerId){

        viewEvents();

        System.out.print("Enter Event ID : ");
        int id=sc.nextInt();

        Event selected=null;

        for(Event e:Database.events){

            if(e.getEventId()==id &&
                    e.getStatus().equalsIgnoreCase("Approved")){

                selected=e;
                break;

            }

        }

        if(selected==null){

            System.out.println("Invalid Event.");
            return;

        }

        System.out.print("Number of Tickets : ");
        int tickets=sc.nextInt();

        if(tickets>selected.getAvailableSeats()){

            System.out.println("Seats Not Available.");
            return;

        }

        int amount=tickets*selected.getTicketPrice();

        int discount=0;

        for(Coupon c:Database.coupons){

            if(c.getConsumerId().equals(consumerId)
                    && !c.isUsed()){

                System.out.println("Coupon Available : "
                        +c.getCouponCode());

                System.out.print("Use Coupon? 1.Yes 2.No : ");

                int ch=sc.nextInt();

                if(ch==1){

                    discount=c.getDiscount();

                    c.setUsed(true);

                }

                break;

            }

        }

        amount=amount-discount;

        if(amount<0)

            amount=0;

        selected.setAvailableSeats(
                selected.getAvailableSeats()-tickets);

        Booking booking=new Booking(
                Database.bookings.size()+1,
                id,
                consumerId,
                tickets,
                amount);

        Database.bookings.add(booking);

        System.out.println("Payment Successful.");

        Receipt.printReceipt(booking);

    }

    public void bookingHistory(String consumerId){

        boolean found=false;

        for(Booking b:Database.bookings){

            if(b.getConsumerId().equals(consumerId)){

                b.displayBooking();
                found=true;

            }

        }

        if(!found)

            System.out.println("No Bookings.");

    }

}