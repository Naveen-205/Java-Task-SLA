package task;

public class NumberPattern1 {
	public static void main(String[] args) {
	
		 
		int[][] arr = { {1},{1,2},{1,2,3},{1,2,3,4} }; 
		
		 
		 for (int i=0; i<arr.length; i++) //row
		 {
			 for (int j=0; j<arr[i].length; j++) //column based on row
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
	}

}

	