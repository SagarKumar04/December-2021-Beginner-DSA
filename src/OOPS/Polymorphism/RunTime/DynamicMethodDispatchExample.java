package OOPS.Polymorphism.RunTime;

class Figure {
    double dimension1;
    double dimension2;

    Figure(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() of Rectangle");
        return (dimension1 * dimension2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() of Triangle");
        return (dimension1 * dimension2 / 2);
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(12, 18);

        Figure figureRef;

        figureRef = f;
        System.out.println("f: " + figureRef.area());

        figureRef = r;
        System.out.println("r: " + figureRef.area());

        figureRef = t;
        System.out.println("t: " + figureRef.area());
    }
}
