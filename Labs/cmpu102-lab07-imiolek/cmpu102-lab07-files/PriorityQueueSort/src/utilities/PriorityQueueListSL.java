package utilities;

public class PriorityQueueListSL<D extends Comparable<D>> implements PriorityQueue<D> {
    public ListElementSL<D> head;  
    
    public PriorityQueueListSL() {
        head = null;
    }
    
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    
    public void insert(D item) {
        ListElementSL<D> compare = head;
        ListElementSL<D> previous = null;
        
        while((compare != null) && (item.compareTo(compare.data()) > 0)) {
            previous = compare;
            compare = compare.next();
            
        }
        
        ListElementSL<D> newEl = new ListElementSL<D>(item, compare);
        
        if(previous != null) {
            previous.setNext(newEl);
        }
        else {
            head = newEl;
        }
        
    }
    
    public D delete() {
        D temp = head.data();
        head = head.next();
        return temp;
    }
    
    public D min() {
        return head.data();
    }
  
    
}
