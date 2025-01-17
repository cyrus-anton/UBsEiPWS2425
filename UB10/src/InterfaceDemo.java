public class InterfaceDemo {
    public interface Function1 {
        int apply (int x);
    }

    public static void main(String[] args) {
        Function1 a = x -> (x + 1);
        a.apply(1); // evaluates to 2

    }
}
