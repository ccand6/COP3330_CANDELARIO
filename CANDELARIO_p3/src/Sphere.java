public class Sphere extends Shape3D {
    double area;
    double radius;
    double volume;
    String Name;

    public Sphere(double radius) {
        getName();
        getArea();
        getVolume();
    }

    public String getName() {
        Name = "sphere";
        return Name;
    }

    public double getArea() {
            area = 4 * Math.PI * Math.pow(radius, 2);
        return 0;
    }

    public double getVolume() {
        volume = (4 / 3) * Math.PI * Math.pow((2 * radius / 2), 3);
        return 0;
    }
}
