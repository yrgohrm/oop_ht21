public class Pair<T1, T2> {
    public T1 value1;
    public T2 value2;

    public Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }

        Pair<?, ?> p2 = (Pair<?, ?>)o;

        return value1.equals(p2.value1) &&
                value2.equals(p2.value2);
    }
}
