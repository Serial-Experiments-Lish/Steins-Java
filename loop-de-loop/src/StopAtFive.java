import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (!(input == 5)) {
                continue;
            }
            break;
        }
    }
}