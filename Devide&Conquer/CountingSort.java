import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 1, 2, 1, 3, 2, -3, 2, 1};
		countingSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void countingSort(int[]arr){
//		fin max and min
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		
//		create helping array 
		int[] help = new int[(max - min)+1];
//		count every element in original array and save counting in helping
		
		for (int i = 0; i < arr.length; i++) {
			help[arr[i]-min]++;
		}
		
//		traverse values from counting array to original
		int idx = 0;
		for (int i = 0; i < help.length; i++) {
			while(help[i] > 0){
				arr[idx++]= i + min;
				help[i]--;
			}
		}
	}

}
