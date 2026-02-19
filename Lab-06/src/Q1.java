import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];  // Array size is 4

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {   // Intentionally exceeds limit
                arr[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        sc.close();
    }
}

