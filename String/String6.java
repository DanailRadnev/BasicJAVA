
public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asd asd asd";
		int howMany = howManyTimes('a', s);
		System.out.println(howMany);

	}
	
	static int howManyTimes(char c, String s){
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c){
				counter++;
			}
		}
		return counter;
	}

}
