import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int x = 9;
		binarySearch(arr,  0, arr.length-1);
		
	}
	
	static void binarySearch(int[] arr, int firstIndex, int lastIndex){
		Scanner sc = new Scanner(System.in);
		int mid = (firstIndex + lastIndex)/2;
		System.out.println(mid + "?");
		int moreOrLess = sc.nextInt();
		
		if(moreOrLess == 0){
			binarySearch(arr, firstIndex, mid-1);
		}
		if(moreOrLess == 2){
			binarySearch(arr, mid+1, lastIndex);
		}
		if(moreOrLess == 1){
			System.out.println("Ok");
			return;
		}
		if(moreOrLess < 0 || moreOrLess > 2){
			System.out.println("Wrong input");
			binarySearch(arr, firstIndex, lastIndex);
		}
	}

}
