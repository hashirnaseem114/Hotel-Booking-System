import java.util.Scanner;

public class HotelBS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of guests
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();

        // Running total
        double hotelRevenue = 0;

        // Loop for every guest
        for (int i = 1; i <= numberOfGuests; i++) {

            // 1. Get season
            System.out.print("Enter the season (Peak or OffPeak) for guest " + i + ": ");
            String season = input.next();

            // 2. Get room type
            System.out.print("Enter the room type (Standard, Deluxe, or Suite) for guest " + i + ": ");
            String roomType = input.next();

            // 3. Get nights
            System.out.print("Enter the number of nights for guest " + i + ": ");
            int nights = input.nextInt();


            // 4. Determine rate
            double rate = 0;
            //    if Peak...
            if (season.equals("Peak")) {
                if (roomType.equals("Standard")) {
                    rate = 5000;
                } else if (roomType.equals("Deluxe")) {
                    rate = 8000;
                } else if (roomType.equals("Suite")) {
                    rate = 12000;
                }
            } 
            //    if OffPeak...
            else if (season.equals("OffPeak")) {
                if (roomType.equals("Standard")) {
                    rate = 3000;
                } else if (roomType.equals("Deluxe")) {
                    rate = 5000;
                } else if (roomType.equals("Suite")) {
                    rate = 8000;
                }
            }

            else {
                System.out.println("Invalid season entered. Please enter either 'Peak' or 'OffPeak'.");
                i--; // Decrement i to repeat this iteration for the same guest
                continue; // Skip to the next iteration of the loop
            }


            // 5. Calculate total
            double total = rate * nights;

            // 6. Check discount
            if (nights > 7) {
                total -= total * 0.15;
            }

            // 7. Display guest's final price
            System.out.println("Guest " + i + "'s final price: Rs. " + total);

            // 8. Add to hotel revenue
            hotelRevenue += total;
        }

        // 9. Display total revenue
        System.out.println("\nTotal Hotel Revenue: Rs. " + hotelRevenue);
    }
}