public class Pair2<T1, T2> implements Comparable<Pair2<T1, T2>> {
    private T1 value1;
    private T2 value2;

    public Pair2(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public T1 getValue1() {
        return value1;
    }
    
    public T2 getValue2() {
        return value2;
    }

    @Override
    public int compareTo(Pair2<T1, T2> o) {
        // HUR GÖR VI DEN HÄR METODEN???
        return 0;
    }
}
