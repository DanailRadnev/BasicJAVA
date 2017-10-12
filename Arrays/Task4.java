
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		boolean arr [][] = {
				{false , false , false, false, false, true},
				{false, false , false, false, true, true},
				{false, false , false, true, true, true},
				{false, false , true, true, false, true},
				{false, true , true, true, true, true},
				{true, true , true, true, true, true}
				};
		
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = 0 ; j < arr.length-(1+i) ; j++){
				if(arr[i][j] == true){
					flag = true;
				}
			}
		}
		
		if(flag){
			System.out.println("There is true.");
		}else {
			System.out.println("There isn't true.");
		}
	}

}
