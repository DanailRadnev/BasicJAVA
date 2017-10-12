import java.util.Scanner;

public class Ad_task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = validation();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <= number; i++) {
			if(i == number){
				sb = sb.append(i);
			}else {
				sb = sb.append(i + ", ");
			}
		}
		
		System.out.println(sb);
		

	}
	
	static int validation(){
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		do{
			System.out.print("Enter a non-negative number: ");
			number = sc.nextInt();
		}while (number < 0);
		return number;
	}

}
