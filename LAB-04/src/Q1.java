import java.util.Scanner;

abstract class Student {
    long rollno;
    long regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no: ");
        rollno = sc.nextInt();
        System.out.println("Enter registration number : ");
        regno = sc.nextLong();
    }
    abstract void course();
}
class Kiitian extends Student {

    void course(){
        System.out.println("Course-B.Tech(Computer Science & Engg");
    }
    void display(){
        System.out.println("Rollno:"+ rollno);
        System.out.println("Registrationno:"+ regno);
        course();
    }
}

public class Q1{
    public static void main(String[] args){
        Kiitian k = new Kiitian();
        k.getinput();
        k.display();
    }

}



