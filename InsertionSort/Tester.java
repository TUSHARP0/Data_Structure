package InsertionSort;
import static InsertionSort.Utils.*;
public class Tester {

	public static void main(String[] args) {
		int[] arr= {50,20,40,80,10,60,30,70};
		insertionSort(arr);
		System.out.println("Sorted Using InsertionSort Algorithm: ");
		for(int i: arr) {
		System.out.print(i+" ");
		}

	}

}
