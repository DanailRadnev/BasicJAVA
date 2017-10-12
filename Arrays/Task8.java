import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int count = 0;
		int value = 1;
		
		while(row <= 0){
			System.out.println("Enter rows: ");
			row = sc.nextInt();
		}
		while(col <= 0){
			System.out.println("Enter columns: ");
			col = sc.nextInt();
		}
		
		int[][] arr = new int[row][col];
//		arr[0][0] = 1;
		
//		for(int i = 0 ; i < arr.length ; i++){
//			for(int j = 0 ; j < arr.length ; j++){
//				if(j == arr.length-(arr.length-i)){
//					arr[i][j] = value;
//					value++;
//				}
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
