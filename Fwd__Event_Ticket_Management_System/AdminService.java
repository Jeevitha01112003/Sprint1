import java.util.Scanner;

public class AdminService {

    Scanner sc = new Scanner(System.in);

    public void addLocation() {

        System.out.println("\n===== ADD LOCATION =====");

        System.out.print("Location ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Location Name : ");
        String name = sc.nextLine();

        System.out.print("City : ");
        String city = sc.nextLine();

        System.out.print("Capacity : ");
        int capacity = sc.nextInt();

        Location location =
                new Location(id,name,city,capacity);

        Database.locations.add(location);

        System.out.println("Location Added Successfully.");

    }

    public void viewLocations() {

        if(Database.locations.isEmpty()) {

            System.out.println("No Locations Available.");
            return;

        }

        for(Location location : Database.locations) {

            location.displayLocation();
            System.out.println();

        }

    }

    public void approveEvent() {

        boolean found = false;

        for(Event event : Database.events) {

            if(event.getStatus().equalsIgnoreCase("Pending")) {

                event.displayEvent();
                found = true;

            }

        }

        if(!found) {

            System.out.println("No Pending Events.");
            return;

        }

        System.out.print("Enter Event ID : ");

        int id = sc.nextInt();

        for(Event event : Database.events) {

            if(event.getEventId()==id) {

                event.setStatus("Approved");

                System.out.println("Event Approved.");

                return;

            }

        }

        System.out.println("Event Not Found.");

    }

    public void viewEvents() {

        if(Database.events.isEmpty()) {

            System.out.println("No Events.");
            return;

        }

        for(Event event : Database.events) {

            event.displayEvent();

        }

    }

}