
public class Ad_task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "mama musa daeba";
		String basicString = "abead um samam";
		checkIsAnagram(first, basicString);

	}
	
	static void checkIsAnagram(String first, String basicString){
		boolean anagram = true;
		int check = 0;
		
		for (int i = 0; i < first.length(); i++) {
			for (int j = 0; j < basicString.length(); j++) {
				if(first.charAt(i) == basicString.charAt(j)){
					check++;
				}
			}
			if(check == 0){
				anagram = false;
				break;
			}
			check =0;
		}		
		
		for (int i = 0; i < basicString.length(); i++) {
			for (int j = 0; j < first.length(); j++) {
				if(first.charAt(j) == basicString.charAt(i)){
					check++;
				}
			}
			if(check == 0){
				anagram = false;
				break;
			}
			check =0;
		}	
		
		if(anagram){
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}

}
