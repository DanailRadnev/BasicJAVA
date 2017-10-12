import java.util.Arrays;
import java.util.regex.*;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "matrak";
		String s2 = "hakunamatata" ;
		int index = 5;
		
		if(s1.length() > s2.length()){
			String new1 = s2.substring(0, index);
			String new2 = s1.substring(index, s1.length());
			System.out.println(s1.length() + " " + new1.concat(new2));
		}else {
			String new1 = s1.substring(0, index);
			String new2 = s2.substring(index, s2.length());
			System.out.println(s2.length() + " " + new1.concat(new2));
			}
	}

}
