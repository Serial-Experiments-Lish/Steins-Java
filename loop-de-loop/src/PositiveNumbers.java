import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter a number:");
            int input = scanner.nextInt();

            if (input > 0) {
                System.out.println("Number is " + input);
                continue;
            } else if (input < 0) {
                System.out.println("Entry must be a positive number");
                continue;
            } else if (input == 0) {
                break;
            }
        }
    }
}