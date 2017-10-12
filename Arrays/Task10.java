
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {
				{1, 5, 5, 5, 5},
				{6, 2, 6, 6, 6},
				{7, 7, 3, 7, 7},
				{8, 8, 8, 4, 8},
				{9, 9, 9, 9, 5}
				};
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j <arr[i].length ; j++){
				if(i == j){
					System.out.print(arr[i][j] + " ");
				}
			}
		}

	}

}
