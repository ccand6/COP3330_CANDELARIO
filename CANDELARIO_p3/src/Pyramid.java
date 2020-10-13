public class Pyramid extends Shape3D {
    double area;
    double length;
    double width;
    double height;
    double volume;
    String Name;

    public Pyramid(double length, double width, double height) {
        area = (length * width) + (width * Math.sqrt(Math.pow(height, 2) + Math.pow((length / 2), 2))) + (length * Math.sqrt(Math.pow(height, 2) + Math.pow((width / 2), 2)));
        volume =  (length * width * height) / 3;
    }

    public String getName() {
        Name = "pyramid";
        return Name;
    }


    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}