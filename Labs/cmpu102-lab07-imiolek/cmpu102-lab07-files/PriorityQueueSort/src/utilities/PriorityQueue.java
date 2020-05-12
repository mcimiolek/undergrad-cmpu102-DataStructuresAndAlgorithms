package utilities;

public interface PriorityQueue<D extends Comparable<D>> {
    public boolean isEmpty();
    public void insert(D item);
    public D delete();
    public D min();
}
