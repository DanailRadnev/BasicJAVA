import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 1, 2, 1, -3, 2, 3, 2, 2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void selectionSort(int[]arr){
		
		for (int i = 0; i < arr.length/2; i++) {			
		
	//		find min and max elements with their index
			int min = arr[i];
			int minIndex = i;
			int max = arr[i];
			int maxIndex = i;		
			
			for (int j = i; j < arr.length-i; j++) {
				if(min > arr[j]){
					min = arr[j];
					minIndex = j;				
				}
				if(max < arr[j]){
					max = arr[j];
					maxIndex = j;
				}
			}
	//		put min element in the begining of the array
			if(maxIndex == i){
				maxIndex = minIndex;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
	//		put max in the end of the array
			temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[maxIndex];
			arr[maxIndex] = temp;
	//		repeat that in smaller range till array is sorted
		}
	}

}
