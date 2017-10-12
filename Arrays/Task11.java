
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {
				{5, 5, 5, 5, 5},
				{6, 6, 6, 6, 6},
				{7, 7, 7, 7, 7},
				{8, 8, 8, 8, 8},
				{9, 9, 9, 9, 9}
				};
		int arr2[][]= new int[5][5];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j <arr[i].length ; j++){
				arr2[j][arr.length - (1+i)] = arr[i][j];
			}
		}
		
		for(int i = 0 ; i <arr2.length ; i++){
			for(int j = 0 ; j < arr2[i].length ; j++){
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
