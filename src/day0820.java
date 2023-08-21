import java.util.*;

public class day0820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] answer = new int[3];
		int[][] num = new int[rows][columns];
		int nums = 1;
		
		 for(int i=0; i<rows; i++){
	            for(int j=0;j<columns;j++){
	                num[i][j] = nums;
	                nums++;
	            }
	        }
		 for(int i=0; i<queries.length; i++) {
			 int[][] circle = new int[(queries[i][2]-queries[i][0])+1][(queries[i][3]-queries[i][1])+1];
			 for(int j=0; j<circle.length; j++) {
				 for(int k=0; k<circle[j].length; k++) { 
					 circle[j][k] = 1;
					 System.out.print(circle[j][k]);
				 }
				 System.out.println();
			 }
		 }
		 
		
	}

}
