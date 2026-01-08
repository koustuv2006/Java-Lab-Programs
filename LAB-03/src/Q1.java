import java.util.Scanner;


class Sheet2D {
    double length, breadth;

    void getDimensions(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * 40;
    }
}


class Box3D extends Sheet2D {
    double height;

    void getDimensions(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * 60;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for 2D Sheet");
        System.out.println("Enter 2 for 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            Sheet2D sheet = new Sheet2D();
            System.out.print("Enter length and breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();

            sheet.getDimensions(l, b);
            System.out.println("Cost of plastic sheet = Rs " + sheet.calculateCost());

        } else if (choice == 2) {
            Box3D box = new Box3D();
            System.out.print("Enter length, breadth and height: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();

            box.getDimensions(l, b, h);
            System.out.println("Cost of plastic box = Rs " + box.calculateCost());

        } else {
            System.out.println("Invalid choice");
        }

    }
}

