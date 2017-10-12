
public class Task_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "qwertyuioplkjhgfdsazxcvbnm";
		String text = "aaa sss ddd ffff rrrrr w gggggggg";
		int counter = 0;
		int maxCounter = 0;
		char letter = ' ';
		
		text = text.toLowerCase();
		
		for (int i = 0; i < alphabet.length(); i++) {			
			for (int j = 0; j < text.length(); j++) {
				if(alphabet.charAt(i) == text.charAt(j)){
					counter++;
				}
				if(counter > maxCounter){
					maxCounter = counter;
					letter = alphabet.charAt(i);
				}
			}
			counter = 0;
		}
		
		System.out.println(maxCounter + " " + (char)letter);

	}

}
