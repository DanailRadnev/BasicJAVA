import java.util.Scanner;

public class Binary2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number between 0 and 50:");
		int x= sc.nextInt();
		System.out.println("Binary:");
		System.out.println(Integer.toString(x,2));

	}

}
