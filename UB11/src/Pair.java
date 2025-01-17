public class Pair <X, Y>{
    private X first;
    private Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        if (first != null)
            this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        if (second != null)
            this.second = second;
    }
}
