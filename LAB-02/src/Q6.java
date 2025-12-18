
class Subtraction {


    int subtract(int a, int b) {
        return a - b;
    }


    int subtract(int a, int b, int c) {
        return a - b - c;
    }


    double subtract(double a, double b) {
        return a - b;
    }
}


class SubtractDemo {
    public static void main(String[] args) {

        Subtraction obj = new Subtraction();


        System.out.println("Subtraction of two integers: " + obj.subtract(10, 5));
        System.out.println("Subtraction of three integers: " + obj.subtract(20, 5, 3));
        System.out.println("Subtraction of two double values: " + obj.subtract(15.5, 5.2));
    }
}

