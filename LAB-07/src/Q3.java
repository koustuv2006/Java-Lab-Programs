import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        File file1 = new File("file1.bin");
        File file2 = new File("file2.bin");

        try (BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(file2))) {

            int b1, b2;
            long position = 1;
            boolean equal = true;

            while (true) {
                b1 = bis1.read();
                b2 = bis2.read();

                if (b1 != b2) {
                    System.out.println("Two files are not equal: byte position at which they differ is " + position);
                    equal = false;
                    break;
                }
                if (b1 == -1) break;
                position++;
            }

            if (equal) System.out.println("Two files are equal.");

        } catch (IOException e) {
            System.out.println("Error comparing files: " + e.getMessage());
        }
    }
}
