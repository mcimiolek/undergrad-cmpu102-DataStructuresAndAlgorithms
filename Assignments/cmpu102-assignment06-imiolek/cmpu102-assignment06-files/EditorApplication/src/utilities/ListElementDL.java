package utilities;

class ListElementDL<D> {

    protected D data;
    protected ListElementDL next;
    protected ListElementDL previous;

    ListElementDL(D d, ListElementDL n, ListElementDL p) {
        data = d;
        next = n;
        previous = p;
        if (next != null) {
            next.previous = this;
        }
        if (previous != null) {
            previous.next = this;
        }
    }

    ListElementDL(D d) {
        this(d, null, null);
    }

    ListElementDL next() {
        return next;
    }

    ListElementDL previous() {
        return previous;
    }

    D data() {
        return data;
    }

    void setNext(ListElementDL n) {
        next = n;
    }

    void setPrevious(ListElementDL p) {
        previous = p;
    }

    void setValue(D data) {
        data = data;
    }

    public String toString() {
        return "<ListElementDL: " + data() + ">";
    }
}
