
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdsa";
		isPalindrome(s);

	}
	static void isPalindrome(String s){
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		String newS = new String(sb);
		if(newS.equals(s)){
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
}
