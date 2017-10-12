
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {
				{5, 5, 5, 5, 5},
				{6, 6, 6, 6, 6},
				{7, 7, 7, 7, 7},
				{8, 8, 8, 8, 8},
				{9, 9, 9, 9, 9}
				};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = arr.length-1 , j = 0 ; j < arr.length ; i-- , j++){
			sum1 += arr[i][j];
		}
		
		for(int i = 0 , j = 0 ; i < arr.length ; i++ , j++){
			sum2 += arr[i][j];
		}
		
		if(sum2 > sum1){
			System.out.println("Main diagonal has a greater value: " + sum1);
		}else {
			if(sum1 > sum2){
				System.out.println("Secondary diagonal has e greater value: " + sum2);
			}else {
				System.out.println("Both diagonals has eaqual values:" + sum1);
			}
		}
	}

}
