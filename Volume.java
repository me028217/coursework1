import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the diameter of this sphere: ");
            double d = scanner.nextDouble();
            sphere(d);
        }
    }

    static double sphere(double d) {
        double volume = 4.0 / 3.0 * Math.PI * Math.pow((d / 2), 3);
        System.out.println(volume);
        return volume;  
    }
    //not sure if i have to ask the user for a diameter, so Ill check this and edit later if needed
}
