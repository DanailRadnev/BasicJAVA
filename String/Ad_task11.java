import java.util.Arrays;
import java.util.Scanner;

public class Ad_task11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = "pechka";
		String censoredWord = censoring(word.length());	
		char[] nov = censoredWord.toCharArray();		
		System.out.println(censoredWord);
		int indexOfLetter = 0;
		boolean flag = true;
		
		int tries = word.length()+1; 
				
		for (int i = 0; i < tries; i++) {	
			System.out.print("You can try " + (tries-i) + " times. Please enter a letter: ");
			String letter = sc.next();
			if(word.contains(letter)){
				indexOfLetter = word.indexOf(letter);
				char temp = word.charAt(indexOfLetter);
				nov[word.indexOf(letter)] = temp;				
			}			
			System.out.println(Arrays.toString(nov));
//			if(check(nov , (tries-i))){
//				System.out.println("You win!");
//				flag = false;
//				break;
//			}
		}
//		
//		if(flag){
//			System.out.println("You lose!");
//		}
	}
	
	static boolean check(char[] arr, int tries){		
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] != '*' && i == arr.length-1){
					return true;
				}
			}
			return false;
	}
	

	
	static String censoring(int n){
		StringBuilder sb = new StringBuilder();
		
			for (int i = 0; i < n; i++) {
				sb = sb.append("*");
			}
			
			String censoredWord = sb.toString();
			return censoredWord;
	}

}
