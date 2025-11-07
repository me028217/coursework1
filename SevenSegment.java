
public class SevenSegment {
    public static void main(String[] args) {
        int n = 29; //number to be displayed
        //need to extract digits into an array from right to left
        int[] d = new int[10];
        int count = 0;

        if (n == 0){
            d[count++] = 0;
        } else{
            while (n > 0) {
                d[count++] = n % 10;
                n /= 10;
            }
        }

        for (int line = 1; line <= 5; line++) {
            for (int i = count -1; i >= 0; i--){
                System.out.print(ssd(d[i], line));
            }
            System.out.println();
        } 
    }

    static String ssd(int d, int n) {
        return switch ((d*10)+n) {
            case 1, 21, 31, 51, 61, 71, 81, 91 -> " -- ";
            case 2, 42, 82, 92 -> "|  |";
            case 12, 22, 32, 72 -> "   |";
            case 52, 62 -> "|   ";
            case 23, 33, 43, 53, 63, 83, 93 -> " -- ";
            case 4, 64, 84 -> "|  |";
            case 14, 34, 44, 54, 74, 94 -> "   |";
            case 24 -> "|   ";
            case 5, 25, 35, 55, 65, 85, 95 -> " -- ";
            default -> "    ";
        }; // Line 1: Top horizontal
        // Line 2: Upper verticals
        // Line 3: Middle horizontal
        // Line 4: Lower verticals
        // Line 5: Bottom horizontal
   }
}
