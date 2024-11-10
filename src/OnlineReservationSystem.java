import java.util.Scanner;

public class OnlineReservationSystem {
    private static LoginManager loginManager = new LoginManager();
    private static ReservationManager reservationManager = new ReservationManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main Menu
        if (login()) {
            int choice;
            do {
                System.out.println("\nOnline Reservation System");
                System.out.println("1. Book Reservation");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        reservationManager.bookReservation();
                        break;
                    case 2:
                        reservationManager.cancelReservation();
                        break;
                    case 3:
                        System.out.println("Thank you for using the Online Reservation System.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 3);
        }
    }

    private static boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (loginManager.authenticate(username, password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
