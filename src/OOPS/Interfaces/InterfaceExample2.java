package OOPS.Interfaces;

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int param) {
        System.out.println("Client's callback() called with: " + param);
    }

    void nonInterfaceMethod() {
        System.out.println("Non-interface method");
    }
}

class AnotherClient implements Callback {
    public void callback(int param) {
        System.out.println("AnotherClient's callback() called with: " + param);
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Callback callback;

        Client client = new Client();
        AnotherClient anotherClient = new AnotherClient();

        callback = client;
        callback.callback(10);

        callback = anotherClient;
        callback.callback(100);
    }
}