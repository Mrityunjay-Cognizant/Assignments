
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the participant details");
        String line = sc.nextLine().trim();
        sc.close();

        String[] parts = line.split(":");
        if (parts.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        String type = parts[0];

        try {
            if ("Organizer".equalsIgnoreCase(type)) {
                String participantId = parts[1];
                String name = parts[2];
                String email = parts[3];
                long phoneNumber = Long.parseLong(parts[4]);
                int ticketsAvailable = Integer.parseInt(parts[5]);
                int ticketsToSell = Integer.parseInt(parts[6]);
                double pricePerTicket = Double.parseDouble(parts[7]);

                Organizer org = new Organizer(participantId, name, email, phoneNumber, ticketsAvailable);
                double revenue = org.calculateSellingRevenue(ticketsToSell, pricePerTicket);

                if (revenue == -1) {
                    System.out.println("Not enough tickets to sell");
                } else {
                    System.out.println("Calculated ticket selling revenue is " + revenue);
                }

            } else if ("Attendee".equalsIgnoreCase(type)) {
                String participantId = parts[1];
                String name = parts[2];
                String email = parts[3];
                long phoneNumber = Long.parseLong(parts[4]);
                double walletBalance = Double.parseDouble(parts[5]);
                int ticketsToBuy = Integer.parseInt(parts[6]);
                double pricePerTicket = Double.parseDouble(parts[7]);

                Attendee att = new Attendee(participantId, name, email, phoneNumber, walletBalance);
                double cost = att.calculateBuyingCost(ticketsToBuy, pricePerTicket);

                if (cost == -1) {
                    System.out.println("Not enough funds to buy tickets");
                } else {
                    System.out.println("Calculated ticket buying cost is " + cost);
                }

            } else {
                System.out.println("Unknown participant type");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
