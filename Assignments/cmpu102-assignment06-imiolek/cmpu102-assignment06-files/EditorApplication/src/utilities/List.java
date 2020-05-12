package utilities;

public interface List<D> {
   void add(D data);
   D remove (D data);
   boolean contains(D data);
   int size();
   boolean isEmpty();
   void clear();
   String toString();
   D elementAt(int index);
   void delete(int index);
   void insert(D data, int index);

}