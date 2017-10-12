import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 1, 2, 1, 3, 2, -3, 2, 1};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int[]arr){
		for (int i = 0; i < arr.length-1; i++) {
			boolean hasSwap = false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
					hasSwap = true;
				}
			}
			if(!hasSwap){
				break;
			}
		}
	}
	
	static void swap(int[]arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
