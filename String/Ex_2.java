
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "maika ti e shibana kurva";
		int words = 1;
		int bukvi = 0;
		int maxBukvi = 0;
		
		for (int i = 0; i < st.length(); i++) {
			bukvi++;
			if(maxBukvi < bukvi){
				maxBukvi = bukvi;
			}
			if(st.charAt(i) == ' '){
				words++;	
				bukvi = -1;
			}			
		}
		
		System.out.println(words + " dumi, nai dylgata e s " + maxBukvi + " bukvi");

	}

}
