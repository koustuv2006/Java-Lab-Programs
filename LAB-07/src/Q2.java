import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String src = sc.nextLine();
        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();


        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File Copied successfully using Byte Stream.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
