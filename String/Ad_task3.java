
public class Ad_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdsa";
		boolean palindrome = true;
		
		
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length()-(i+1))){
				palindrome = false;
				break;
			}
		}
		
		if(!palindrome){
			System.out.println("not");
		}else {
			System.out.println("palin");
		}

	}

}
