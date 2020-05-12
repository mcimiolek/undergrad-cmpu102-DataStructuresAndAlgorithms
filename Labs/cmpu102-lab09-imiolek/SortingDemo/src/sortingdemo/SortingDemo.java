package sortingdemo;
import acm.program.*;
import java.util.Random;


public class SortingDemo extends ConsoleProgram {
    
    private static final int START_SIZE = 1000;   
    private static final int NUM_SIZES = 10;
    private static final int ARRAYS_PER_SIZE = 10;
    private static final int TEST_RANGE = 1000;
    private Random randomIntegers = new Random(); 
    private int comparisons;
    private Double[] cpuTimeTable = new Double[NUM_SIZES];
    private Integer[] comparisonTable = new Integer[NUM_SIZES];
    private Integer[] sizeTable = new Integer[NUM_SIZES];
    private long cpuTime;
    private int comparisonCount = 0;
 
    public void run() {
        Integer[] data;
        for(int x = 0; x < NUM_SIZES; x++) {
            comparisonCount = 0;
            cpuTime = 0;
            for (int i = 0; i < ARRAYS_PER_SIZE; i++) {
                long curCpu = System.currentTimeMillis();
                data = randomIntegerArray((x + 1)* START_SIZE,TEST_RANGE);
                
                //selectionSort(data);
                //bubbleSort(data);
                //insertionSort(data);
                //mergeSort(data);
                quickSort(data);
            
                cpuTime += System.currentTimeMillis() - curCpu;
            }
            comparisonTable[x] = comparisonCount/ARRAYS_PER_SIZE;
            cpuTimeTable[x] = cpuTime/(double)ARRAYS_PER_SIZE;
            sizeTable[x] = (x+1)*START_SIZE;      
        }       
        printArray(comparisonTable);
        printArray(sizeTable);
        printArray(cpuTimeTable);
    }

    public static void main(String[] args) {
        new SortingDemo().start();
    }
    
    public  <T extends Comparable<T>> void bubbleSort(T[] data)  {
        for (int numSorted = 0; numSorted < data.length; numSorted++) {
            for (int index = 1; index < data.length-numSorted; index++) {
                if (compare(data[index-1], data[index]) > 0)
                    swap(data,index-1,index);
            }
        }
    }
    
    public  <T extends Comparable<T>> void selectionSort(T[] data) {
	for (int numUnsorted = data.length; numUnsorted > 0; numUnsorted--) {
	    int max = 0;
	    for (int index = 1; index < numUnsorted; index++) 
		if (compare(data[index], data[max]) > 0) max = index;
	    swap(data,max,numUnsorted-1);
	}
    }

    public  <T extends Comparable<T>> void insertionSort(T[] data) {
        for (int numSorted = 1; numSorted < data.length; numSorted++) {
            T temp = data[numSorted];
            int index = numSorted;
            while (index > 0) {
                if (compare(temp, data[index-1]) < 0)
                    data[index] = data[index-1];
                else break;
                index--;
            }
            data[index] = temp;
        }
    }
    
    
    public  <T extends Comparable<T>> void mergeSort(T[] data) {
        T[] temp = data.clone();
        mergeSortHelper(data,temp,0,data.length);
    }
    
    private  <T extends Comparable<T>> void mergeSortHelper(T[] data, T[] temp, int low, int high) {
        int n = high-low;
        int middle = low + n/2;
        if (n < 2) return;
        mergeSortHelper(data,temp,low,middle);
        mergeSortHelper(data,temp,middle,high);
        merge(data,temp,low,middle,high);
    }
    
    private  <T extends Comparable<T>> void merge(T[] data, T[] temp,  int low, int middle, int high) {
        int ri = low;
        int li = low;
        int hi = middle;
        while (li < middle && hi < high)
            if (compare(data[li], data[hi]) < 0) temp[ri++] = data[li++];
            else temp[ri++] = data[hi++];
        if (li < middle)
            do  temp[ri++] = data[li++]; while (li < middle);
        else
            do temp[ri++] = data[hi++]; while (hi < high);
        for (int i=low; i<high; i++) data[i] = temp[i];
    }
    
    
    public  <T extends Comparable<T>> void quickSort(T[] data) {
        quickSortHelper(data,0,data.length-1);
    }
    
    public  <T extends Comparable<T>> void quickSortHelper(T[] data, int low, int high) {
        int pivot;
        if (low >= high) return;
        pivot = partition(data,low,high);
        quickSortHelper(data,low,pivot-1);
        quickSortHelper(data,pivot+1,high);
    }
    
public  <T extends Comparable<T>> int partition(T[] data, int left, int right) {
    while (true) {
        while (left < right && compare(data[left], data[right])<0) right--;
        if (left < right) swap(data,left++,right);
        else return left;
        while (left < right && compare(data[left], data[right])<0) left++;
        if (left < right) swap(data,left,right--);
        else return right;
    }
}
    
   
    
    
    public  <T> void swap(T[] data, int i, int j) {
        T temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public Integer[] randomIntegerArray(int n, int m) {
        Integer[] array = new Integer[n];
        for (int i=0; i<n; i++) 
            array[i] = Math.abs(randomIntegers.nextInt())%m;
        return array;        
    }
    
    public void printArray(Object[] array) {
        for (Object item : array) println(item);
    }
    
    public <T extends Comparable<T>> int compare(T foo, T bar) {
        comparisonCount++;
        return foo.compareTo(bar);
    }
    
}
