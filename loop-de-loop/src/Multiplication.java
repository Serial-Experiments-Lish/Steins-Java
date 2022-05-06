import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        int input = scanner.nextInt();
        int i = 1;
        

        for ( ; i <= 10; ) {
            int multipliedNums = input * i;
            System.out.println(input + " x " + i + " = " + multipliedNums);
            i++;
        }
    }
}