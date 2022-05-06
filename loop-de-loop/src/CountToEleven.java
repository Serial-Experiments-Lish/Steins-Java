import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int input = scanner.nextInt();

        for ( ; input <= 11 ; ) {
            System.out.println(input);
            input++;
        } 
    }
}
