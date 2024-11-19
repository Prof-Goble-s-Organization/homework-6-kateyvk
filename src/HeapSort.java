import java.util.Arrays;


public class HeapSort {
    public static void heapSort(Integer[] values) {
    	//using the constructor to make empty heap
    	
    	
    	COMP232ArrayHeap<Integer, Integer> newHeap = new COMP232ArrayHeap<>();
    	//filling empty heap.
    	for(Integer i:values) {
    		newHeap.add(i,i);
    	}
    	//Remove the values in descending order, just keep removing the root
    	for(int j=0; j< values.length;j++) {
    		values[j]= newHeap.remove();
    	}
    	
    }

    public static void main(String[] args) {
        int size = 20;
        Integer[] list = new Integer[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
