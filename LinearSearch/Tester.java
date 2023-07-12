package LinearSearch;
import static LinearSearch.Utils.*;
public class Tester {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		System.out.println("Linear Search Returning position of searched element: ");
		System.out.println(LinearSearch(arr, 10));
		System.out.println(LinearSearch(arr, 60));
		System.out.println(LinearSearch(arr, 70));
	}
}
