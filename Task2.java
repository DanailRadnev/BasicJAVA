import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a1= ");
		
		float a1= sc.nextFloat();
		System.out.println("Enter a2= ");
		float a2= sc.nextFloat();
		System.out.println("Enter a3=");
		float a3= sc.nextFloat();
		float c;
		c=a1;
		a1=a2;
		a2=a3;
		a3=c;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
}

