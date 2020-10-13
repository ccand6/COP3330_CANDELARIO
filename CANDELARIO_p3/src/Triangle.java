import java.util.Scanner;

public class Triangle extends Shape2D {

    Scanner Input = new Scanner(System.in);
    double base;
    double height;
    double area;
    String Name;

    public Triangle(double base, double height) {
        getName();
        getArea();
    }

    public String getName() {
        Name = "triangle";
        return Name;
    }

    public double getArea() {
        System.out.print(base + height);
        area = base * height;
        return 0;
    }

}

