package OOPS.ClassInitializers;

public class InstanceInitializer {
    int num;

    //instance initializer
    {
        num = 222;
        System.out.println("In instance initializer: " + num);
    }

    //constructor
    InstanceInitializer() {
        num = 111;
        System.out.println("In default constructor: " + num);
    }

    public static void main(String[] args) {
        System.out.println("In main() function");
        InstanceInitializer instanceInitializer = new InstanceInitializer();
    }
}
