package parkinglot;

public class ListElementSL {
    protected Object data;
    protected ListElementSL next;
    
    public ListElementSL(Object data) {
        this(data,null);
    }
    
    public ListElementSL(Object data, ListElementSL next) {
        this.data = data;
        this.next = next;
    }
    
    public ListElementSL next() {
        return next;
    }
    
    public void setNext(ListElementSL next) {
        this.next = next;
    }
    
    public Object data() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    public String toString() {
        return "<ListElementSL: "+data()+">";
    }
}

