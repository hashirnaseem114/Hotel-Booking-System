# Hotel Booking System

A simple Java-based hotel booking system that calculates the final room price for multiple guests based on the season, room type, and length of stay.

## Features

* Takes the number of guests as input.
* Supports two seasons:

  * Peak
  * OffPeak
* Supports three room types:

  * Standard
  * Deluxe
  * Suite
* Calculates the room price based on the season and room type.
* Applies a **15% discount** for stays longer than 7 nights.
* Displays the final price for each guest.
* Calculates and displays the hotel's total revenue.

## Pricing

| Season  |        Standard |          Deluxe |            Suite |
| ------- | --------------: | --------------: | ---------------: |
| Peak    | Rs. 5,000/night | Rs. 8,000/night | Rs. 12,000/night |
| OffPeak | Rs. 3,000/night | Rs. 5,000/night |  Rs. 8,000/night |

### Long-Stay Discount

Guests staying for **more than 7 nights** receive a **15% discount** on their total room price.

## Technologies Used

* Java
* `Scanner` for user input
* `for` loops
* `if-else` statements
* Nested conditional statements

## How to Run

1. Make sure Java is installed.
2. Open the project in VS Code.
3. Open the terminal in the project folder.
4. Compile the program:

```bash
javac HotelMS.java
```

5. Run the program:

```bash
java HotelMS
```

## Example

```text
Enter the number of guests: 2

Enter the season (Peak or OffPeak) for guest 1: Peak
Enter the room type (Standard, Deluxe, or Suite) for guest 1: Deluxe
Enter the number of nights for guest 1: 5
Guest 1's final price: Rs. 40000.0

Enter the season (Peak or OffPeak) for guest 2: OffPeak
Enter the room type (Standard, Deluxe, or Suite) for guest 2: Suite
Enter the number of nights for guest 2: 10
Guest 2's final price: Rs. 68000.0

Total Hotel Revenue: Rs. 108000.0
```

## Author

**Muhammad Hashir Naseem**
