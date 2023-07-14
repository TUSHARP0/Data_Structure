package HeapSort;
import static HeapSort.Utils.*;
public interface Tester {
public static void main(String[] args) {
	int[] arr= {50,20,40,80,10,60,30,70};
	HeapSort(arr,arr.length);
	System.out.println("Sorted Using Heap Sort Algorithm: ");
	for(int i: arr) {
	System.out.print(i+" ");
	}
}
}
