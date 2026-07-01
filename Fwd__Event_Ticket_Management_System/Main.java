import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Authentication auth = new Authentication();
        AdminService adminService = new AdminService();
        EventService eventService = new EventService();
        ConsumerService consumerService = new ConsumerService();

        while (true) {

            System.out.println("\n====================================");
            System.out.println("      EVENT TICKET BOOKING");
            System.out.println("====================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    auth.register();
                    break;

                case 2:

                    User user = auth.login();

                    if (user == null)
                        break;

                    // ---------------- ADMIN ----------------

                    if (user.getRole().equals("ADMIN")) {

                        while (true) {

                            System.out.println("\n========== ADMIN ==========");
                            System.out.println("Logged In : " + user.getUserId());
                            System.out.println("1. Add Location");
                            System.out.println("2. View Locations");
                            System.out.println("3. Approve Event");
                            System.out.println("4. View Events");
                            System.out.println("5. Logout");

                            System.out.print("Choice : ");

                            int ch = sc.nextInt();

                            switch (ch) {

                                case 1:
                                    adminService.addLocation();
                                    break;

                                case 2:
                                    adminService.viewLocations();
                                    break;

                                case 3:
                                    adminService.approveEvent();
                                    break;

                                case 4:
                                    adminService.viewEvents();
                                    break;

                                case 5:
                                    System.out.println("Logged Out Successfully.");
                                    break;

                                default:
                                    System.out.println("Invalid Choice.");
                            }

                            if (ch == 5)
                                break;

                        }

                    }

                    // ------------ EVENT MANAGER ------------

                    else if (user.getRole().equals("EVENT_MANAGER")) {

                        while (true) {

                            System.out.println("\n====== EVENT MANAGER ======");
                            System.out.println("Logged In : " + user.getUserId());
                            System.out.println("1. Create Event");
                            System.out.println("2. View My Events");
                            System.out.println("3. Cancel Event");
                            System.out.println("4. Logout");

                            System.out.print("Choice : ");

                            int ch = sc.nextInt();

                            switch (ch) {

                                case 1:
                                    eventService.createEvent(user.getUserId());
                                    break;

                                case 2:
                                    eventService.viewMyEvents(user.getUserId());
                                    break;

                                case 3:
                                    eventService.cancelEvent();
                                    break;

                                case 4:
                                    System.out.println("Logged Out Successfully.");
                                    break;

                                default:
                                    System.out.println("Invalid Choice.");
                            }

                            if (ch == 4)
                                break;

                        }

                    }

                    // ---------------- CONSUMER ----------------

                    else if (user.getRole().equals("CONSUMER")) {

                        while (true) {

                            System.out.println("\n========== CONSUMER ==========");
                            System.out.println("Logged In : " + user.getUserId());
                            System.out.println("1. View Events");
                            System.out.println("2. Book Ticket");
                            System.out.println("3. Booking History");
                            System.out.println("4. Logout");

                            System.out.print("Choice : ");

                            int ch = sc.nextInt();

                            switch (ch) {

                                case 1:
                                    consumerService.viewEvents();
                                    break;

                                case 2:
                                    consumerService.bookTicket(user.getUserId());
                                    break;

                                case 3:
                                    consumerService.bookingHistory(user.getUserId());
                                    break;

                                case 4:
                                    System.out.println("Logged Out Successfully.");
                                    break;

                                default:
                                    System.out.println("Invalid Choice.");
                            }

                            if (ch == 4)
                                break;

                        }

                    }

                    break;

                case 3:

                    System.out.println("Thank You for Using Event Ticket Booking System.");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");

            }

        }

    }

}