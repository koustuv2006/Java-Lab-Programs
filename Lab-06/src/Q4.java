import java.util.*;

class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;

    void setTime(int h, int m, int s)
            throws HrsException, MinException, SecException {

        if (h < 0 || h > 24)
            throw new HrsException("hour is not between 0 and 24");

        if (m < 0 || m > 60)
            throw new MinException("minute is not between 0 and 60");

        if (s < 0 || s > 60)
            throw new SecException("second is not between 0 and 60");

        hours = h;
        minutes = m;
        seconds = s;

        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        try {
            System.out.print("Enter hours: ");
            int h = sc.nextInt();

            System.out.print("Enter minutes: ");
            int m = sc.nextInt();

            System.out.print("Enter seconds: ");
            int s = sc.nextInt();

            t.setTime(h, m, s);
        }
        catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}

