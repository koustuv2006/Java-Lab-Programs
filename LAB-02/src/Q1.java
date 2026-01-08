import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");


        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();


            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        System.out.println("\n--- Results ---");
        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);

        scanner.close();
    }
}
