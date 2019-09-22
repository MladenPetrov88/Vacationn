import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String people = scanner.next();
        String day = scanner.next();
        double price = 0;

        if (people.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                ;
                price = 10.46;
            }
        }

        if (people.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                ;
                price = 16;
            }
        }

        if (people.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }

        double totalPrice = price * count;

        if (people.equals("Students") && count >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (people.equals("Business") && count >= 100) {
            totalPrice = totalPrice - (10 * price);
        } else if (people.equals("Regular") && (count >= 10 && count <= 20)) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
