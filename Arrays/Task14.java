
public class Task214{	
	public static void main(String[] args) {
		
		int n = 9;
		int m = 11;
		int[][] arr = new int[n][m];
		int value = 1;
		int maxValue = n*m;
		int minRows = 0;
		int maxRows = n-1;
		int minCols = 0;
		int maxCols = m-1;
		
		while(value < maxValue){
			for (int i = minRows; i <= maxRows; i++) {
				arr[i][minCols] = value++;
				if(value >= maxValue){
					break;
				}
			}
			for(int i = minCols + 1 ; i <= maxCols ; i++ ){
				arr[maxRows][i] = value++;
				if(value >= maxValue){
					break;
				}
			}
			for(int i = maxRows-1 ; i >= minRows ; i--){
				arr[i][maxCols] = value++;
				if(value >= maxValue){
					break;
				}
			}
			for(int i = maxCols-1 ; i >= minCols+1 ; i--){
				arr[minRows][i] = value++;
				if(value >= maxValue){
					break;
				}
			}
			if(value >= maxValue){
				break;
			}
			maxRows--;
			maxCols--;
			minRows++;
			minCols++;
		}
		
		if((maxValue)%2 != 0){
			arr[arr.length-(arr.length/2+1)][arr[0].length-(arr[0].length/2+1)] = value;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%2d " , arr[i][j]);
			}
			System.out.println();
		}
		
	}
}