
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1;
		int arr [][] = {
				{5, 5, 5, 5, 5},
				{6, 6, 6, 6, 2},
				{7, 7, 7, 2, 2},
				{8, 8, 2, 2, 2},
				{9, 2, 2, 2, 2}
				};
		
		for(int i = 1 ; i < arr.length ; i++){
			for(int j = arr.length-i ; j < arr.length ; j++){
				sum *= arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
