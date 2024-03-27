import java.util.Comparator;

class ComparatorInterFace implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        return i1>i2?-1:i1<i2?1:0;
    }
}
