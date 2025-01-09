package apackage.three;
import apackage.one.*;

public class ClassB {
    public void methodTwo () {
        ClassA c1 = new ClassA();
        apackage.two.ClassA c2 = new apackage.two.ClassA();

        c1.wrappedMethodOne();
        c2.methodOne();
    }
}
