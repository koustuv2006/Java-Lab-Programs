import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

class TestNumber {

    void processInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (2 * num));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestNumber obj = new TestNumber();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            obj.processInput(n);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}

