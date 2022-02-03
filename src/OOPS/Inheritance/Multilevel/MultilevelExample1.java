package OOPS.Inheritance.Multilevel;

class Shape {
    void displayShape() {
        System.out.println("In Shape class");
    }
}

class Rectangle extends Shape {
    void displayRectangle() {
        System.out.println("In Rectangle class");
    }
}

class Cuboid extends Rectangle {
    void displayCuboid() {
        System.out.println("In Cuboid class");
    }
}

public class MultilevelExample1 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.displayShape();
        cuboid.displayRectangle();
        cuboid.displayCuboid();
    }
}
