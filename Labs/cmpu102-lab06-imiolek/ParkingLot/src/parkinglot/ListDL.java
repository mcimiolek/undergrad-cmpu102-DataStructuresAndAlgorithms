package parkinglot;

public class ListDL {
    protected int count;
    protected ListElementDL head;
    protected ListElementDL tail;
    
    public ListDL() {
        head = null;
        tail = null;
        count = 0;
    }
    
    public void add(Object data) {
        addToTail(data);
    }
    
    public void addToTail(Object data) {
        ListElementDL temp = new ListElementDL(data, null, tail);
        if (tail != null) {
            tail.setNext(temp);
        }
        tail = temp;
        
        if (head == null) {
            head = temp;
        }
        count++;
    }
    
    public void addToHead(Object data) {
        ListElementDL temp = new ListElementDL(data, null, tail);
        if (head != null) {
            head.setNext(temp);
        }
        head = temp;
        
        if (tail == null) {
            tail = temp;
        }
        count++;
    }
    
    public Object removeFromTail() {
        ListElementDL temp = tail;
        tail.setPrevious(tail);
        
        if (tail == null) {
            head = null;
        }
        else {
            tail.setNext(null);
        }
        
        count--;
        return temp; 
    }
    
    public Object removeFromHead() {
        ListElementDL temp = head;
        head.setPrevious(head);
        
        if (head == null) {
            tail = null;
        }
        else {
            head.setNext(null);
        }
        
        count--;
        return temp; 
    }
    
    public boolean contains(Object data) {
        ListElementDL current = head;
        while((current != null) && !(current.data().equals(data))) {
            current = current.next();
        }
        if(current != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public Object remove(Object data) {
        ListElementDL current = head;
        while((current != null) && !(current.data().equals(data))) {
            current = current.next();
        }
        if(current == null) {
            return null;
        }
        else {
            if(current.previous() != null) {
                current.previous().setNext(current.next());
            }
            else {
                head = current.next();
            }
            if(current.next() != null) {
                current.next().setPrevious(current.previous());
            }
            else {
                tail = current.previous();
            }
            return current.data();
        }
        
    }
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<ListDL:\n");
        ListElementDL current = head;
        while (current!=null) {
            s.append(" "+current.data()+"\n");
            current = current.next();
        }
        s.append(">");
        return s.toString();
    }
}
