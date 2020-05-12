package parkinglot;

public class ListElementDL {
    protected Object data;
    protected ListElementDL next;
    protected ListElementDL previous;
    
    public ListElementDL(Object d, ListElementDL n, ListElementDL p) {
        this.data = d;
        this.next = n;
        this.previous = p;
        
        if(n != null) {
            n.setPrevious(this);
        }
        if(p != null) {
            p.setNext(this);
        }
    }
    
    public ListElementDL next() {
        return next;
    }
    
    public void setNext(ListElementDL n) {
        this.next = n;
    }
    
    public ListElementDL previous() {
        return previous;
    }
    
    public void setPrevious(ListElementDL p) {
        this.previous = p;
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
