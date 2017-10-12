
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bAsi sHiBanata zadacha";
		s = upperCaseFirstLetter(s);
		System.out.println(s);
		

	}
	
	static String upperCaseFirstLetter(String s1){
		String[] arr = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i].substring(0, 1).toUpperCase();
			String b = arr[i].substring(1, arr[i].length()).toLowerCase();
			sb = sb.append(a).append(b).append(" ");
		}
		String newS = new String(sb).trim();
		return newS;
	}

}
