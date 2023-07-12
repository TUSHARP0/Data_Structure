package BubbleSort;

import static BubbleSort.Utils.*;

public class Tester {

	public static void main(String[] args) {
		int[] arr= {50,20,40,80,10,60,30,70};
		BubbleSort(arr);
		System.out.println("Sorted Using BubbleSort Algorithm: ");
		for(int i: arr) {
		System.out.print(i+" ");
		}

	}

}
