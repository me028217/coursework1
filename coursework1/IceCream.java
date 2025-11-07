import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //student number: 34028217. Last 6 digits: 028217
        //vanilla = 17, chocolate = 28, strawberry = 02
        double vanilla = 17.0;
        double chocolate = 28.0;
        double strawberry = 2.0;

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        String flavour = scanner.nextLine();

        if (!flavour.equals("v") && !flavour.equals("c") && !flavour.equals("s")) {
            System.out.println("We don't have that flavour.");
            scanner.close();
            return;
        }

        System.out.println("How many scoops would you like?");
        int scoops = scanner.nextInt();

        if (scoops <= 0) {
            System.out.println("We don't sell just a cone.");
            scanner.close();
            return;
        } else if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            scanner.close();
            return;
        }
        scanner.close();

        double price = 100.0; // cone price in pence
        switch (flavour) {
            case "v" -> price += vanilla * scoops;
            case "c" -> price += chocolate * scoops;
            case "s" -> price += strawberry * scoops;
        }
        double totalPounds = price / 100.0;
        System.out.printf("That will be £%.2f please.", totalPounds);
        scanner.close();
    }
}

