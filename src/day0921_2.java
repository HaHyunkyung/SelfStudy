import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day0921_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int sum = Integer.MAX_VALUE;
		StringTokenizer token = new StringTokenizer(str,"-");
		
		while(token.hasMoreTokens()) {
			int temp=0;
			
			StringTokenizer add = new StringTokenizer(token.nextToken(),"+");
			
			while(add.hasMoreTokens()) {
				temp+=Integer.parseInt(add.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum-=temp;
			}
		}
		System.out.println(sum);
	}

}
