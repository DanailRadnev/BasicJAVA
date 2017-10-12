import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = "I love banica.";
		int counter = 0;
		char simvol = sc.next().charAt(0);		
		
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == simvol){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
