import java.util.Arrays;

import javax.naming.PartialResultException;

public class QiuckSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,2,6,7,8,9};
		int[] arr2 = new int[5];
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr2));
		
	}
	static void quickSort(int[]arr, int left, int right){
		if(left >= right){
			return;
		}
		
		int k = partition(arr, left, right);
		
		quickSort(arr, k+1, right);
		quickSort(arr, left, k-1);
	}
	
	static int partition(int[]arr, int left, int right){
		int pivot = arr[right];
		int index = left; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		for (int i = left; i < right; i++) {
			if(arr[i] <= pivot){
				swap(arr, index++, i);
			}
		}
		swap(arr, right, index);
		return index;
	}
	
	static void swap(int[]arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}


