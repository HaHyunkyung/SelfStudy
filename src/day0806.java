
public class day0806 {

	public static long main(String[] args) {
		// TODO Auto-generated method stub
		long answer = 0;
	    int n=5;
        long[] dp = new long[n+2];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3; i<n+1; i++){
            dp[i] =(dp[i-1]+dp[i-2])%1234567;
        }
        answer = dp[n];
        return answer;
	}

}
