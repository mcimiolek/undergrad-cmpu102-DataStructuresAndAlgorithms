package associativemapdemo;

public class Association<K extends Comparable<K>, D> implements Comparable<Association<K, D>>{
    public K key;
    public D data;
    
    public Association(K key) {
        this.key = key;
        this.data = null;
    }
    
    public Association(K key, D data) {
        this.key = key;
        this.data = data;
    }
    
    public int compareTo(Association<K, D> other) {
        return key.compareTo(other.key);
    }
    
    public String toString() {
        return "<" + this.key + "," + this.data + ">";
    }
}
