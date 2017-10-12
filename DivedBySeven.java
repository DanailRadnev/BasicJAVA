import java.util.Scanner;

public class DivedBySeven{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value for a=");
		int a= sc.nextInt();
		a= a%7;
		boolean b = a == 0;
		System.out.println(b);
		
	
		

	}

}
