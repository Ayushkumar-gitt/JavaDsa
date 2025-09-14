// Demo.java
import java.util.Scanner;
class Box {
    double length;
    double width;
    double height;
    
    double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Box b = new Box();
        b.height = h;
        b.width = w;
        b.length = l;
        System.out.println("Volume = " + b.volume());
        sc.close();
    }
}
