package assignment2;

public class Question9 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(3, 4, 5);
        Square cube = new Square(3);
        Tube cylinder = new Tube(3, 5);
        Pyramid cone = new Pyramid(3, 5);

        System.out.println("Rectangle - Volume: " + box.volume() + ", Surface Area: " + box.surfaceArea());
        System.out.println("Square - Volume: " + cube.volume() + ", Surface Area: " + cube.surfaceArea());
        System.out.println("Tube - Volume: " + cylinder.volume() + ", Surface Area: " + cylinder.surfaceArea());
        System.out.println("Pyramid - Volume: " + cone.volume() + ", Surface Area: " + cone.surfaceArea());
    }
}

abstract class Shape3D {
    abstract double surfaceArea();
    abstract double volume();
}

class Rectangle extends Shape3D {
    double length, width, height;

    Rectangle(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}

class Square extends Shape3D {
    double side;

    Square(double s) {
        side = s;
    }

    double surfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

class Tube extends Shape3D {
    double radius, height;

    Tube(double r, double h) {
        radius = r;
        height = h;
    }

    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Pyramid extends Shape3D {
    double radius, height;

    Pyramid(double r, double h) {
        radius = r;
        height = h;
    }

    double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

