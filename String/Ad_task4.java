
public class Ad_task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String text = "abcdefghijklmnopqrstuvwxyz";
		int[] result = new int[26];
		int counter = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if(alphabet[i] == text.charAt(j)){
					counter++;
				}
			}
			result[i] = counter;
			counter = 0;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(alphabet[i] + "-" + result[i] + " ");
		}

	}

}
