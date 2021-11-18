
public class Pair3<T1> {
    public T1 value1;
    public T1 value2;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
        result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair3<?> other = (Pair3<?>) obj;
        if (value1 == null) {
            if (other.value1 != null)
                return false;
        }
        else if (!value1.equals(other.value1))
            return false;
        if (value2 == null) {
            if (other.value2 != null)
                return false;
        }
        else if (!value2.equals(other.value2))
            return false;
        return true;
    }

    
}
