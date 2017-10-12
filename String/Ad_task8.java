import java.util.Scanner;

public class Ad_task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = validation();
		StringBuilder n = new StringBuilder();
		int counter = 1;
		
		for (int i = 0; i < numbers.length()-1; i++) {
			if(i == numbers.length()-1 && numbers.charAt(i) == numbers.charAt(i+1)){
				
			}
			
			if(numbers.charAt(i) == numbers.charAt(i+1)){
				
				counter++;
			
			}else {
				
				switch (numbers.charAt(i)){
				
				case '2' :
					if(counter == 1){
						n = n.append("a");
					}else {
						if(counter == 2){
							n = n.append("b");
						}else {
							n = n.append("c");
						}
					}
					break;
				
				case '3':
					if(counter == 1){
						n = n.append("d");
					}else {
						if(counter == 2){
							n = n.append("e");
						}else {
							n = n.append("f");
						}
					}
					break;
					
				case'4':
					if(counter == 1){
						n = n.append("g");
					}else {
						if(counter == 2){
							n = n.append("h");
						}else {
							n = n.append("i");
						}
					} 
					break;
					
				case '5':
					if(counter == 1){
						n = n.append("j");
					}else {
						if(counter == 2){
							n = n.append("k");
						}else {
							n = n.append("l");
						}
					}
					break;
					
				case '6':
					if(counter == 1){
						n = n.append("m");
					}else {
						if(counter == 2){
							n = n.append("n");
						}else {
							n = n.append("o");
						}
					}
					break;
					 
				case '7':
					if(counter == 1){
						n = n.append("p");
					}else {
						if(counter == 2){
							n = n.append("q");
						}else {
							if(counter == 3){
								n = n.append("r");
							}else {
								n = n.append("s");
							}
						}
					}
					break;
					
				case '8':
					if(counter == 1){
						n = n.append("t");
					}else {
						if(counter == 2){
							n = n.append("u");
						}else {
							n = n.append("v");
						}
					}
					break;
					
				case '9':
					if(counter == 1){
						n = n.append("w");
					}else {
						if(counter == 2){
							n = n.append("x");
						}else {
							if(counter == 3){
								n = n.append("y");
							}else {
								n = n.append("z");
							}
						}
					}
					break;
				}
				counter = 1;
			}
		}
		
		System.out.println(n);

	}
	
	static String validation(){
		Scanner sc = new Scanner(System.in);
		String valid = "";
		do{
			System.out.println("Enter a string which ends with dot.");
			valid = sc.nextLine();
		}while (valid.charAt(valid.length()-1 ) != '.');
		return valid;
	}

}
