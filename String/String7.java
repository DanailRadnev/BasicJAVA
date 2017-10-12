public class String7 {
	
	public static void main(String[] args) {
	
		String s1 = "banica";
		char c = 'l';
		StringBuilder s2 = new StringBuilder();
		
		for (int i = 0; i < s1.length(); i++){
			c = s1.charAt(i);
			c += 5;
			s2.append(c);
		}

	System.out.println(s2);
	}

}
