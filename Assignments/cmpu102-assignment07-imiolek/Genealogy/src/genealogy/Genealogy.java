package genealogy;
import acm.program.*;
import utilities.*;

public class Genealogy extends ConsoleProgram {
    public BTree<BirthRecord> genealogy = new BTree<BirthRecord>(
            new BirthRecord("Gearge Washington", 1731), new BTree<BirthRecord>(
            new BirthRecord("Mary Ball", 1708), new BTree<BirthRecord>(
            new BirthRecord("Joeseph Ball", 1649)), new BTree<BirthRecord>(
            new BirthRecord("Mary", 1650))),
            new BTree<BirthRecord>(
            new BirthRecord("Augustine Washington", 1694), new BTree<BirthRecord>(
            new BirthRecord("Lawrence Washington", 1659)), new BTree<BirthRecord>(
            new BirthRecord("Mildred Washington", 1671))));

    
    public void run() {
        println("Washington's Ancestors Ordered Backwards by Generation: ");
        queueOrderPrint(genealogy);
        println();
        println("Washington's Ancestors Ordered Backwards by Birth Year: ");
        priorityQueueOrderPrint(genealogy);
    }

    public static void main(String[] args) {
        new Genealogy().start();
    }
    
    public void queueOrderPrint(BTree<BirthRecord> bTree) {
        Queue<BTree<BirthRecord>> theQueue = new QueueListDL<BTree<BirthRecord>>();
        theQueue.enQueue(bTree);
        
        while (!theQueue.isEmpty()) {
            BTree bT = theQueue.deQueue();
            print(bT.data+" ");
            if (bT.left!=null) theQueue.enQueue(bT.left);
            if (bT.right!=null) theQueue.enQueue(bT.right);
        }
    }
    
    public void priorityQueueOrderPrint(BTree<BirthRecord> bTree) {
        PriorityQueueListSL<BTree<BirthRecord>> queues = new PriorityQueueListSL<BTree<BirthRecord>>();
        Queue<BTree<BirthRecord>> theQueue = new QueueListDL<BTree<BirthRecord>>();
        theQueue.enQueue(bTree);
        
        while (!theQueue.isEmpty()) {
            BTree bT = theQueue.deQueue();
            queues.insert(bT);
            if (bT.left!=null) theQueue.enQueue(bT.left);
            if (bT.right!=null) theQueue.enQueue(bT.right);
        }

        while (!queues.isEmpty()) {
            BTree bT = queues.delete();
            print(bT.data + " ");
        }
    }
}
