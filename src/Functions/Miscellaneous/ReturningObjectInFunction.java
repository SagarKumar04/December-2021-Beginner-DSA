package Functions.Miscellaneous;

class Example {
    int num;
}

public class ReturningObjectInFunction {
    static Example getObject() {
        Example e = new Example();
        e.num = 1123;
        return e;
    }

    public static void main(String[] args) {
        Example e = getObject();

        System.out.println("e.num: " + e.num);
    }
}
