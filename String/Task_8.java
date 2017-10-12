import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int maxStringLength = 0;

		String[] arr = new String[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter word: ");
			arr[i] = sc.next();
		}

		for (int i = 0; i < arr.length - 1; i++) { // find the largest string length to know the width;
			if (arr[i].length() > arr[i + 1].length() && arr[i].length() > maxStringLength) {

				maxStringLength = arr[i].length();
			}
			if (arr[i].length() < arr[i + 1].length() && arr[i+1].length() > maxStringLength) {

				maxStringLength = arr[i + 1].length();
			}

			if (arr[i].length() == arr[i+1].length() && arr[i].length() > maxStringLength) {
						
				maxStringLength = arr[i].length();
			}
				
			
		}


		for (int i = 0; i < maxStringLength + 2; i++) { // +2 "*" for the frame;
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			int spaces = 0;

			if (arr[i].length() == maxStringLength) { // in this case we don't need spaces;

				System.out.print("*" + arr[i] + "*");

			} else {
				
				System.out.print("*" + arr[i]);
				spaces = maxStringLength - (arr[i].length()-1);
				

				for (int j2 = 0; j2 < spaces; j2++) {

					if (j2 == spaces - 1) {

						System.out.print("*");

					} else {

						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
		
		for (int i = 0; i < maxStringLength + 2; i++) {
			System.out.print("*");
		}

	}

}
