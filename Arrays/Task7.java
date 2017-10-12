import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int temp = 0;
		
		while(row <= 0){
			System.out.println("Enter rows: ");
			row = sc.nextInt();
		}
		while(col <= 0){
			System.out.println("Enter columns: ");
			col = sc.nextInt();
		}
		
		int[][] arr = new int[row][col];
		arr[0][0] = 1;
				
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 1; j < arr.length; j++) {
				arr[j][i] = arr[j-1][i] +1 ;
				temp = arr[j][i];
			}
			if(i < arr[0].length-1){
				arr[0][i+1] = temp+1;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
