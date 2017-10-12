import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] arr ={5,4,3,2,1,6,7,8,9};
		
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		int k = 1;
		System.out.println(arr[arr.length-k]);
	}
	
	static void quickSort(int[] arr, int left, int right){
		if(left >= right){
			return;
		}
		
		int k = partition(arr, left, right);
		
		quickSort(arr, left, k-1);
		quickSort(arr, k+1, right);
	}
	
	static int partition(int[] arr, int left, int right){
		int pivot = arr[right];
		int k = left;
		
		for (int i = left; i < right; i++) {
			if(arr[i] <= pivot){
				swap(arr, i, k++);
			}
		}
		swap(arr, k, right);
		return k;
	}
	
	static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
