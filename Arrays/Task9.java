
public class Task01 {
	public static void main(String[] args) {
		int arr [][] = {
					{5, 5, 5, 5},
					{5, 4, 9, 8},
					{7, 7, 7, 7},
					{7, 7, 2, 4}
					};
		int count = 0;
		int maxCount = 0;
		int value = 0;
		
		for(int row = 0 ; row < arr.length ; row++){
			for(int col = 0 ; col < arr[row].length ; col++){
				
				for(int compareRow = 0 ; compareRow < arr.length ; compareRow++){
					for(int compareCol = 0 ; compareCol < arr[compareRow].length ; compareCol++){
						
						if(arr[row][col] == arr[compareRow][compareCol]){
							count++;
							if(count > maxCount){
								maxCount = count;
								value = arr[row][col];
							}
						}					
					}
				}
				count = 0;
			}
		}
		System.out.println(value);
	}
}


