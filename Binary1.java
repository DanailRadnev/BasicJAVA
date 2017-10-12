import java.util.Scanner;

public class Binary1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values for a,b,c=");
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
		
		int firstNumber= 1<<a;
		int secondNumber= 1<<b;
		int thirdNumber= 1<<c;
		int result= firstNumber|secondNumber|thirdNumber;
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		
		

	}

}
