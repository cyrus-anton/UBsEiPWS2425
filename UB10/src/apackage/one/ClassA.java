package apackage.one;

public class ClassA {
    void methodOne ( ) {
        System.out.println("Ich bin ClassA im Paket apackage.one.");
    }

    public void wrappedMethodOne() {
        methodOne();
    }
}
