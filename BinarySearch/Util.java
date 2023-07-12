package BinarySearch;

public class Util {
	public static int BinarySearch(int [] arr, int key) {
		int mid=0,low=0,high=arr.length-1;
		while(low <= high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key < arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return -1;
	}
	
	public static int BinarySearchByRecur(int[] arr, int low, int high,int key) {
		if(low > high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid] == key) {
			return mid;
		}
		if(arr[mid] > key) {
			return BinarySearchByRecur(arr, low, mid-1, key);
		}
		else {
			return BinarySearchByRecur(arr, mid+1, high, key);
		}
		
	}
}
