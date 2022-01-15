package Functions.Miscellaneous;

class Test {
    int num;
}

public class ObjectsAndReference {
    public static void main(String[] args) {
        //creating an object
        Test obj;
        obj = new Test();
        obj.num = 10;
        System.out.println("1. obj.num: " + obj.num);

        //creating a reference
        Test ref;
        ref = obj;
        ref.num = 102;
        System.out.println("2. obj.num: " + obj.num);
    }
}
