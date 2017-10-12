
public class Ad_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Danail Nedyalkov Radnev";
		
		System.out.print(name.charAt(0));
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' '){
				System.out.print(name.charAt(i+1));
			}
		}

	}

}
