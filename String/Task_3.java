
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "asdsa";
		String st2;
		boolean palin = true;
		
		for (int i = 0 ; i < st.length() ; i++) {
			if(st.charAt(i) != st.charAt(st.length()-(i+1))){
				palin = false;
			}
		}
		System.out.println(palin);

	}

}
