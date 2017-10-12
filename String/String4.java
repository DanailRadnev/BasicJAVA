
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bAsi sHiBanata zadacha ";
		s = s.trim();
		int letters = 0;
		int maxLetters = 0;
		int words = 1;
		
		for (int index = 0; index < s.length(); index++) {
			if(s.charAt(index) == ' '){
				words++;
				letters = 0;
				continue;
			}
			letters++;
			if(letters > maxLetters){
				maxLetters = letters;
			}
			
		}
		
		System.out.println(words + " words" + ", the longest is with " + maxLetters + " letters.");

	}

}
