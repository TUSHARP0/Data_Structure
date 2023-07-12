package BinarySearch;
import static BinarySearch.Util.*;
public class Tester {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		System.out.println(BinarySearch(arr, 40));
		System.out.println(BinarySearch(arr, 60));
		System.out.println(BinarySearch(arr, 90));
		System.out.println();
		
		System.out.println("Bineary Search Using Recursion: ");
		System.out.println(BinarySearchByRecur(arr, 0, arr.length-1, 80));
		System.out.println(BinarySearchByRecur(arr, 0, arr.length-1, 60));
		System.out.println(BinarySearchByRecur(arr, 0, arr.length-1, 90));
	}
}
