package QuickSort;

import static QuickSort.Utils.*;

public class Tester {

	public static void main(String[] args) {
		int[] arr= {50,20,40,80,10,60,30,70};
		quickSort(arr,0,arr.length-1);
		System.out.println("Sorted Using Quick Sort Algorithm: ");
		for(int i: arr) {
		System.out.print(i+" ");
		}

	}

}
