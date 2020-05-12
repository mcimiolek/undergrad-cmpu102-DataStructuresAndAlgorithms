package parkinglot;

public class ListSL {
    protected int count;
    protected ListElementSL head;
    
    public ListSL() {
        head = null;
        count = 0;
    }
    
    public void add(Object data) {
        addToHead(data);
    }
    
    public void addToHead(Object data) {
        head = new ListElementSL(data, head);
        count++;
    }
    
    public Object removeFromHead() {
        ListElementSL temp = head;
        head = head.next();
        count--;
        return temp.data();
    }
    
    public void addToTail(Object data) {
        ListElementSL temp = new ListElementSL(data,null);
        if (head != null) {
            ListElementSL current = head;
            while (current.next() != null) {
                current = current.next();
            }
            current.setNext(temp);
        } else head = temp;
        count++;
    }
    
    public Object removeFromTail() {
        ListElementSL current = head;
        ListElementSL previous = null;
        while (current.next() != null) {
            previous = current;
            current = current.next();
        }
        if (previous == null) {
            head = null;
        } else {
            previous.setNext(null);
        }
        count--;
        return current.data();
    }
    
    public Object headPeek() {
        return head.data();
    }
    
    public Object tailPeek() {
        ListElementSL current = head;
        while (current.next() != null) {
            current = current.next();
        }
        return current.data();
    }
    
//    public boolean contains(Object data) {
//        ListElementSL current = head;
//        while (current != null && !current.data().equals(data)) {
//            current = current.next();
//        }
//        return current != null;
//    }
    
    public boolean contains(Object data) {
        return containsHelper(data,head);
    }   
    
    private boolean containsHelper(Object data, ListElementSL node) {
        if (node==null) 
            return false;
        else if (node.data().equals(data)) 
            return true;
        else return containsHelper(data,node.next());
    }
    
    public Object remove(Object data) {
        ListElementSL current = head;
        ListElementSL previous = null;
        while (current != null && !current.data().equals(data)) {
            previous = current;
            current = current.next();
        }
        if (current != null) {
            if (previous == null) {
                head = current.next();
            } else {
                previous.setNext(current.next());
            }
            count--;
            return current.data();
        }
        return null;
    }
      
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public void clear() {
        head = null;
        count = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<ListSL:\n");
        ListElementSL current = head;
        while (current!=null) {
            s.append(" "+current.data()+"\n");
            current = current.next();
        }
        s.append(">");
        return s.toString();
    }
}





