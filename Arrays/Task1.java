import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		
		while(row <= 0){
			System.out.print("How many rows do you want: ");
			row = sc.nextInt();
		}
		while(col <= 0){
			System.out.print("How many columns do you want: ");
			col = sc.nextInt();
		}
		
		int arr[][] = new int[row][col];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.println("Enter a value for cell in row " + (i+1) + " and column " + (j+1) + " :");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
