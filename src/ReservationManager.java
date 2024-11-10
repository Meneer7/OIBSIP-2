import java.util.ArrayList;
import java.util.Scanner;

public class ReservationManager {
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private static int nextPnr = 1001;
    private Scanner scanner = new Scanner(System.in);

    public void bookReservation() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Train Number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Train Name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter Class Type (First class, Soft sleeper or AC): ");
        String classType = scanner.nextLine();
        System.out.print("Enter Date of Journey (DD-MM-YYYY): ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter Departure Station: ");
        String from = scanner.nextLine();
        System.out.print("Enter Destination Station: ");
        String to = scanner.nextLine();

        Reservation reservation = new Reservation(nextPnr++, name, trainNumber, trainName, classType, dateOfJourney, from, to);
        reservations.add(reservation);
        System.out.println("Reservation booked successfully! PNR: " + reservation.getPnr());
    }

    public void cancelReservation() {
        System.out.print("Enter PNR number to cancel: ");
        int pnr = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getPnr() == pnr) {
                System.out.println("Reservation Found: " + reservations.get(i));
                System.out.print("Confirm cancellation? (yes/no): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("yes")) {
                    reservations.remove(i);
                    System.out.println("Reservation cancelled successfully.");
                } else {
                    System.out.println("Cancellation aborted.");
                }
                return;
            }
        }
        System.out.println("PNR not found. Please check and try again.");
    }
}
