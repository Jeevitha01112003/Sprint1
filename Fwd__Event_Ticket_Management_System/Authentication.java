import java.util.Scanner;

public class Authentication {

    Scanner sc = new Scanner(System.in);

    public void register() {

        System.out.println("\n===== REGISTER =====");

        System.out.print("Enter User ID : ");
        String id = sc.next();

        for(User u : Database.users) {

            if(u.getUserId().equals(id)) {

                System.out.println("User ID already exists.");
                return;
            }
        }

        System.out.print("Enter Password : ");
        String password = sc.next();

        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("\nChoose Role");
        System.out.println("1. Admin");
        System.out.println("2. Event Manager");
        System.out.println("3. Consumer");

        System.out.print("Choice : ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                Database.users.add(new Admin(id,password,name));
                break;

            case 2:
                Database.users.add(new EventManager(id,password,name));
                break;

            case 3:
                Database.users.add(new Consumer(id,password,name));
                break;

            default:
                System.out.println("Invalid Role");
                return;
        }

        System.out.println("Registration Successful.");

    }

    public User login() {

        System.out.println("\n===== LOGIN =====");

        System.out.print("User ID : ");
        String id = sc.next();

        System.out.print("Password : ");
        String password = sc.next();

        for(User u : Database.users) {

            if(u.getUserId().equals(id)
                    && u.getPassword().equals(password)) {

                System.out.println("\nWelcome " + u.getName());

                return u;

            }

        }

        System.out.println("Invalid Credentials.");

        return null;

    }

}