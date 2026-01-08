import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions:");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

// Derived class
class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box Dimensions:");
        System.out.println("Height = " + height);
    }
}

// Derived class
class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("Wood Box Dimensions:");
        System.out.println("Thickness = " + thick);
    }
}


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        // Creating object of WoodBox
        WoodBox wb = new WoodBox(l, w, h, t);


    }
}

