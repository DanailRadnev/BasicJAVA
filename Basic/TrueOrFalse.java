import java.util.Scanner;

public class TrueOrFalse{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five values (true or false):");
		boolean a= sc.nextBoolean();
		boolean b= sc.nextBoolean();
		boolean c= sc.nextBoolean();
		boolean d= sc.nextBoolean();
		boolean e= sc.nextBoolean();
		boolean kraino= (a==b&&b==c&&c==d&&d==e);
		System.out.println("End result:" +kraino);
	}

}
