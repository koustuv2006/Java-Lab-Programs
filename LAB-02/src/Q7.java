import java.util.Scanner;

class MyRectangle {
    double length;
    double breadth;


    MyRectangle() {
        this.length = 0;
        this.breadth = 0;
        System.out.println("Default Constructor called: Dimensions set to 0.");
    }


    MyRectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
        System.out.println("Parameterized Constructor called: Dimensions set to " + l + " and " + b + ".");
    }


    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        MyRectangle rect1 = new MyRectangle();
        rect1.calculateArea();

        System.out.println("-----------------------------------");


        System.out.print("Enter length: ");
        double L = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double B = sc.nextDouble();

        MyRectangle rect2 = new MyRectangle(L, B);
        rect2.calculateArea();

        sc.close();
    }
}

