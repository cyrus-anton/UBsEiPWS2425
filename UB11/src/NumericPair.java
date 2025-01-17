public class NumericPair<X extends Number> extends IdenticalPair<X> {

    public NumericPair(X first, X second){
        super (first, second);
    }

    public double sum () {
        return getFirst().doubleValue() + getSecond().doubleValue();
    }
}
