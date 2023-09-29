import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class day0928 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int dp[] = new int[num+1];
		
		for(int i=1; i<=num; i++) {
			if(i==1) {
				dp[i]=1;
			}
			else if(i==2) {
				dp[i] = 2;
			}else {
				dp[i]=(dp[i-2]+dp[i-1])%10007;
			}
		}
		System.out.println(dp[num]);
	}

}
