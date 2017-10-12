import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = validation();		
		String word2 = validation();
		
		if(word.length() > word2.length()){
			String newWord = word2.substring(0, 5);
			String newWord2 = word.substring(5);
			newWord = newWord.concat(newWord2);
			System.out.println(newWord);
		}else {
			if(word2.length() > word.length()){
				String newWord = word.substring(0, 5);
				String newWord2 = word2.substring(5);
				newWord = newWord.concat(newWord2);
				System.out.println(newWord);
			}else {
				String newWord = word.substring(0, 5);
				String newWord2 = word2.substring(5);
				newWord = newWord.concat(newWord2);
				System.out.println(newWord);
			}
		}
		
		

	}
	
	static String validation(){
		Scanner sc = new Scanner(System.in);
		String valid = " ";
		while(valid.length() < 10 || valid.length() > 20){
			System.out.println("Enter a word: ");
			valid = sc.nextLine();
		}
		System.out.println("OK!");
		return valid;
		
	}

}
