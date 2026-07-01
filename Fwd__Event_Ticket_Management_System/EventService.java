import java.util.Scanner;

public class EventService {

    Scanner sc = new Scanner(System.in);

    public void createEvent(String managerId) {

        if (Database.locations.isEmpty()) {
            System.out.println("No locations available. Contact Admin.");
            return;
        }

        System.out.println("\n===== CREATE EVENT =====");

        System.out.print("Event ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Event Name : ");
        String name = sc.nextLine();

        System.out.print("Event Date : ");
        String date = sc.nextLine();

        System.out.print("Event Time : ");
        String time = sc.nextLine();

        System.out.println("\nAvailable Locations");

        for(Location l : Database.locations) {
            System.out.println(l.getLocationId() + " - " + l.getLocationName());
        }

        System.out.print("Enter Location Name : ");
        String location = sc.nextLine();

        System.out.print("Ticket Price : ");
        int price = sc.nextInt();

        System.out.print("Total Seats : ");
        int seats = sc.nextInt();

        Event e = new Event(id, name, date, time,
                price, seats, location,
                managerId, "Pending");

        Database.events.add(e);

        System.out.println("Event Created Successfully.");
        System.out.println("Waiting for Admin Approval.");

    }

    public void viewMyEvents(String managerId) {

        boolean found = false;

        for(Event e : Database.events) {

            if(e.getManagerId().equals(managerId)) {

                e.displayEvent();
                found = true;

            }

        }

        if(!found)
            System.out.println("No Events Created.");

    }

    public void cancelEvent() {

        System.out.print("Enter Event ID : ");
        int id = sc.nextInt();

        for(Event e : Database.events) {

            if(e.getEventId()==id) {

                e.setStatus("Cancelled");

                for(Booking b : Database.bookings) {

                    if(b.getEventId()==id) {

                        String code="CPN"+b.getBookingId();

                        Coupon c=
                                new Coupon(code,
                                        b.getConsumerId(),
                                        100);

                        Database.coupons.add(c);

                    }

                }

                System.out.println("Event Cancelled.");
                System.out.println("Coupons Sent.");

                return;

            }

        }

        System.out.println("Event Not Found.");

    }

}