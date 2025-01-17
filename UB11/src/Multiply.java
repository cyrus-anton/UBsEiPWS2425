public class Multiply implements GenericFunction<Integer, Integer> {

    private final int factor;

    public Multiply (int factor) {
        this.factor = factor;
    }

    public Integer calculate (Integer  x){
        return x * factor;
    }


    public static void main(String[] args) {
        GenericFunction<Integer, Integer> timesThree = (x) -> x*3;

        GenericFunction<Integer, Integer> timesFour = x -> {
            return x * 4;
        };
    }
}