import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first string: ");
		String firstWord = "patka";
//		System.out.println("Enter our second string: ");
		String secondWord = "shmutka";
		int indexVertical = 0;
		int indexHorizontal = 0;
		
		for (int i = 0; i < firstWord.length(); i++) {
			if(secondWord.indexOf(firstWord.charAt(i)) != -1){
				indexVertical = secondWord.indexOf(firstWord.charAt(i));
				indexHorizontal = i;
				break;
			}
		}
		
		for (int i = 0; i < secondWord.length(); i++) {
			if(i != indexVertical){
				for (int j = 0; j < indexHorizontal; j++) {
					System.out.print(" ");
				}
				System.out.println(secondWord.charAt(i));
			}else {
				System.out.println(firstWord);
			}
		}
	}

}
