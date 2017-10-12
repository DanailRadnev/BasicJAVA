
public class Task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String first = "asdfrddddd";
		String second = "asdfr";
		
		boolean a = true;
		
		for (int i = 0; i < first.length(); i++) {
			String temp = first.substring(i, i+1);
			if(!second.contains(temp)){
				a = false;
				System.out.println(temp);
			}
		}
		
		
		for (int i = 0; i < second.length(); i++) {
			String temp = second.substring(i, i+1);
			if(!first.contains(temp)){
				a = false;
				System.out.println(temp);
			}
		}
		System.out.println(a);
	}

}
