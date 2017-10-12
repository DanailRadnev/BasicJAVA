
public class Task213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][5];
		
		int max = 4+51;
		int value = 1;
		
		for(int indexSum = 0 ; indexSum <= max ; indexSum++){
			
			for (int col = 0; col < arr[0].length; col++) {				
				for (int row = 0; row < arr.length; row++) {
					if(col+row == indexSum){
						arr[row][col] = value++;						
					}
				}
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
