
public class Ad_task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = {
				{3, 3, 3},
				{3, 3, 3},
				{3, 3, 3}
			};
		
		String str = "";
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				str = str.concat(matrix[i][j]+ " ");
			}
			str = str.concat("\n");
		}
		
		System.out.println(str);

	}

}
