
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefg";
		String s2 = "abcdefgh";
		boolean flag= true;
		
		for (int i = 0; i < s1.length(); i++) {
			String temp = s1.substring(i, i+1);
			if(!s2.contains(temp)){
				flag = false;
				System.out.println(temp);
			}			
		}
		
		if(flag){
			for (int i = 0; i < s2.length(); i++) {
				String temp = s2.substring(i, i+1);
				if(!s1.contains(temp)){
					flag = false;
					System.out.println(temp);
				}
			}
		}
		
		System.out.println(flag);
	}

}
