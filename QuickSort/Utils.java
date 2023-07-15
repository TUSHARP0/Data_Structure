package QuickSort;

public class Utils {
	public static void quickSort(int[] arr,int left,int right) {
		if(left>=right) {
			return;
		}
		int pivotLoc=partition(arr,left,right);
		quickSort(arr,left,pivotLoc-1);
		quickSort(arr, pivotLoc+1, right);
		
	}
	
	private static int partition(int[] arr,int left,int right) {
		int pivot=arr[left];
		while(left<right) {
			while(arr[right] > pivot && left != right) {
				right--;
			}
			if(left != right) {
				arr[left]=arr[right];
				left++;
			}
			while((arr[left] < pivot)&&(left != right)) {
				left++;
			}
			if(left != right) {
				arr[right]=arr[left];
				right--;
			}
				
	}
		arr[left]=pivot;
		return right;
	}
	}	

