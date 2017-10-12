
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aaaabaaa";
		String s2 = "sssbssss";
		int minLength = 0;
		
		match(s1, s2);
		
		if(s1.length() < s2.length()){
			minLength = s1.length();
		}else {
			minLength = s2.length();
		}
		
		if(s2.length() == s1.length()){
			System.out.println("equal lengths");
		}else {
			System.out.println("not equal lengths");
		}
		
		if(!s1.equals(s2)){
			System.out.println("difference in position: ");
			for (int i = 0; i < minLength; i++) {
				if(s1.charAt(i) != s2.charAt(i)){
					System.out.println(i+1 + " " + s1.charAt(i)+ "-" + s2.charAt(i));
				}
			}
		}else {
			System.out.println("they are equal");
		}

	}
	
	static void match(String s1, String s2){
		int indexOne = 0;
		int indexTwo = 0;
		boolean  flag = true;
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)){
					indexOne = i;
					indexTwo = j;
					flag = false;
					break;
				}
			}
			if(!flag){
				break;
			}
		}
		
		for (int i = 0; i < s2.length(); i++) {
			if(i != indexTwo){
				for (int j = 0; j < indexOne; j++) {
					System.out.print(" ");
				}
				System.out.println(s2.charAt(i));
			}else {
				System.out.println(s1);
				continue;
			}
		}
	}

}
