
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{2, 7, 6},
				{9, 5, 1},
				{4, 3, 8}
				};
		int sumRow = 0;
		int sumCol = 0;
		int sumDiagonalOne = 0;
		int sumDiagonalTwo = 0;
		int compareSum =0;
		boolean magic = true;
		
		for(int i = 0 ; i <arr.length ; i++){
			compareSum += arr[0][i];
		}
		
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				sumRow += arr[i][j];
				sumCol += arr[j][i];
				
				if(i == j){
					sumDiagonalOne += arr[i][j];
				}
				if(j == arr.length-(1+i)){
					sumDiagonalTwo += arr[i][j];
				}
			}
			
				if(sumRow != compareSum || sumCol != compareSum ){
					magic = false;		
					break;
				}	

			sumRow = 0;
			sumCol = 0;
		}
		
		if(sumDiagonalOne != compareSum || sumDiagonalTwo != compareSum){
			magic = false;
		}
					
		
		System.out.println(magic);

	}

}
