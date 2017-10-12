
public class Array1{

	public static void main(String[] args) {
		
		int[] arr = {3 , 5 , 7, 9 };
		int [] arr2 = {9 , 7 , 5 , 3};
		boolean equal = true;
		
		for(int i=0 , j = (arr2.length-1) ; i< arr.length && j >=0 ; i++ , j--){
			if(arr[i] != arr2[j]){
				equal = false;
				break;
			}
			else {
				equal = true;
			}
		}
		System.out.println(equal);
	}

}
