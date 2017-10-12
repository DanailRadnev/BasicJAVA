import java.util.Arrays;

public class Task2FromTestV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "az obicham da sym az poneje e nai hubavoto az poneje poneje poneje az";
		
		String[]arr = text.split(" ");
		int freq = 0;
		int maxFreq = 0;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].equals(arr[j])){
					freq++;
				}
			}
			if(maxFreq < freq){
				maxFreq = freq;
				index = i;
			}
		}
		
		System.out.println(arr[index]);
		
		

	}

}
