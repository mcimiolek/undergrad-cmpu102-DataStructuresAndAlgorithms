package parkinglot;

public class Association {
    protected String key;
    protected ParkingSpace data;
    
    public Association(String key) {
        this(key,null);
    }
    
    public Association(String key, ParkingSpace data) {
        this.key = key;
        this.data = data;
    }
    
    public boolean equals(Object other) {
        Association otherAssoc = (Association)other;
        return key().equals(otherAssoc.key());
    }
    
    public int compareTo(Object other) {
        Association otherAssoc = (Association)other;
        return key().compareTo(otherAssoc.key());
    }
    
    public ParkingSpace data() {
        return data;
    }
    
    public String key() {
        return key;
    }
    
    public void setData(ParkingSpace data) {
        this.data = data;
    }
    
    public String toString() {
        return "<Association: Key: " + key + " | Data: " + data + ">";
    }
    
}
