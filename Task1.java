import java.util.Scanner;

public class asdasdas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter a= ");
		int a= sc.nextInt();
		int b= a/1000;
		System.out.println(b);
		a=a%1000;
		int c= a/100;
		System.out.println(c);
		a=a%100;
		int d= a/10;
		System.out.println(d);
		a=a%10;
		System.out.println(a);
		
		
		
	}

}
