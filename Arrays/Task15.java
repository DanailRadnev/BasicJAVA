
public class Task15{

public static void main(String[] args) {
		

		int n = 7;
		int m = 9;
		
		int[][] arr = new int[n][m];
		int counter = 1;
		int row = 0;
		int col = 0;
		
		char direction = 'D' ;
		
		for(int i = 0 ; i < n*m ; i++){
			arr[row][col] = counter++;
			
			switch(direction){
			
			case 'D':
				if((row+1) >= arr.length || arr[row+1][col] != 0){
					direction = 'R';
					col++;
				}else {
					row++;
				}
				break;
				
			case 'R':
				if((col+1) >= arr[0].length || arr[row][col+1] != 0){
					direction = 'U';
					row--;
				}else {
					col++;
				}
				break;
				
			case 'U':
				if((row-1) < 0 || arr[row-1][col] != 0){
					direction = 'L';
					col--;
				}else {
					row--;
				}
				break;
				
			case 'L':
				if((col-1) < 0 || arr[row][col-1] != 0){
					direction = 'D';
					row++;
				}else {
					col--;
				}
				break;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%2d " , arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
