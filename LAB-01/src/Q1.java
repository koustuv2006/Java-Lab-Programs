import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        // Displaying output
        System.out.println("Display Name: " + name);
        System.out.println("Display Roll No: " + roll);
        System.out.println("Display Section: " + section);
        System.out.println("Display Branch: " + branch);

        sc.close();
    }
}

