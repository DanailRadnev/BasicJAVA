import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int sum = 0;
		int max = 0;
		int maxCol = 0;
				
		while(row <= 0){
			System.out.println("Enter rows: ");
			row = sc.nextInt();
		}
		while(col <= 0){
			System.out.println("enter columns :");
			col = sc.nextInt();
		}
		
		int arr[][] = new int[row][col];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.println("Enter a value do row " + (i+1) + ", column " + (j+1) + " :");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				sum += arr[i][j];
			}
			if(max < sum){
				max = sum;
				maxCol = i;
			}
			sum = 0;
		}
		
		System.out.println("Row " + (maxCol+1) + " has a max sum = " + max);
		
	}

}
