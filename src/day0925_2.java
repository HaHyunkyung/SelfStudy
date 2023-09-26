import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day0925_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sscore = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
		double[] dscore = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0,0.0};
		double sum=0;
		double creditsum=0;
		int flag = 0;
		for(int i=0; i<20;i++) {
			String str = br.readLine();
			double credit = Double.parseDouble(str.split(" ")[1]);
			creditsum += credit;
			String grade = str.split(" ")[2];
	
			if(grade.equals("P")) {
				creditsum -= credit;
			}
			int index = Arrays.binarySearch(sscore, grade);
	
			sum = sum+(credit*dscore[index]);
			
		}
		
			System.out.println(sum/creditsum);
		
	}

}
