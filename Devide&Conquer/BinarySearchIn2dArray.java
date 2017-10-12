
public class BinarySearchIn2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{3, 5, 6},
				{11, 18, 40}
				};
		
		int x = 100;
		System.out.println(binarySearch(arr, x, 0, arr[0].length-1, 0));

	}
	
	static int binarySearch(int[][] arr, int x, int right, int left, int row){
		int mid = (left+right)/2;
		
		if(row >= arr.length){
			return -1;
		}
		
		if(right > left && row < arr.length){
			
			return binarySearch(arr, x, 0, arr[row].length-1, ++row);
			
		}
		
		if(arr[row][mid] == x){
			System.out.print("elementa e na red "+ (row+1) + " kolona ");
			return mid+1;
			
		}else {
			
			if(arr[row][mid] > x){
				
				return binarySearch(arr, x, right, mid-1, row);
				
			}else {
				
				return binarySearch(arr, x, mid+1, left, row);
			}
		}
	}

}
