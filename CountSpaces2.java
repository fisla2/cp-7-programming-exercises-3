import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a quote
        System.out.print("Enter your favorite quote: ");
        String quote = input.nextLine();

        int spaceCount = 0;

        // Count spaces in the quote
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Total number of spaces: " + spaceCount);

        input.close();
    }
}
