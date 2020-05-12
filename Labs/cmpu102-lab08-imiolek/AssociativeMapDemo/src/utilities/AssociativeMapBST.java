package utilities;

import associativemapdemo.Association;

public class AssociativeMapBST<K extends Comparable<K>, D> implements AssociativeMap<K, D> {
    private BSTree<Association<K, D>> bsTree;
    
    public AssociativeMapBST() {
        bsTree = new BSTree<Association<K, D>>();
    }
    
    public void insert(K key, D data) {
        this.bsTree.insert(new Association<K, D>(key, data));
    }
    
    public D delete(K key) {
        Association<K, D> hold = new Association<K, D>(key);
        return this.bsTree.delete(hold).data;
    }
    
    public D lookUp(K key) {
        Association<K, D> hold = new Association<K, D>(key);
        return this.bsTree.member(hold).data;
    }
    
    public Queue<Association<K, D>> elements() {
        return bsTree.elements();
    }
    
}
