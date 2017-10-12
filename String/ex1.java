import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yout first string: ");
		String first = sc.next();
		System.out.println("Enter you second string: ");
		String second = sc.next();
		boolean equal = true;
		
		if(first.length() == second.length()){
			System.out.println("Two strings have equal lengths.");	
			for (int i = 0; i < second.length(); i++) {
				if(first.charAt(i) != second.charAt(i)){
					System.out.println("Difference at position " + (i+1) + ": " + first.charAt(i) + "-" + second.charAt(i));
					equal = false;
				}
			}
		}else {
			
			System.out.println("They are not equal by length.");
			
			if(first.length() > second.length()){
				
				for (int i = 0; i < second.length(); i++) {
					if(first.charAt(i) != second.charAt(i)){
						System.out.println("Difference at position " + (i+1) + ": " + first.charAt(i) + "-" + second.charAt(i));
						equal = false;
					}					
				}
			}else {
				
				for (int i = 0; i < first.length(); i++) {					
					if(first.charAt(i) != second.charAt(i)){
						System.out.println("Difference at position " + (i+1) + ": " + first.charAt(i) + "-" + second.charAt(i));
						equal = false;
					}
				}
			}
		}
		
		if(equal){
			System.out.println("They a equal by characters.");
		}
		
		
	}

}
