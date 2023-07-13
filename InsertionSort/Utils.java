package InsertionSort;

public class Utils {
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<i;j++) {
				if(arr[i] < arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
