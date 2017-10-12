
public class Ad_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "pedal";
		String second = "pedalsko";
		
		
		perfix(first, second);
		

	}
	
	static void perfix(String first, String second){
		
		boolean per = true;
				
		for (int i = 0; i < first.length(); i++) {
			if(first.charAt(i) != second.charAt(i)){
				per = false;
			}
		}
		
		if(per){
			System.out.println("Perfix");
		}else {
			System.out.println("Not perfix");
		}
	}

}
