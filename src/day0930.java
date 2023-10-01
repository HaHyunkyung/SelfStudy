import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day0930 {
	public static int Max = Integer.MAX_VALUE;
	public static int Min = Integer.MIN_VALUE;
	public static int N;
	public static int[] number;
	public static int[] operator = new int[4];
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		number = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		dfs(number[0],1);
		
		System.out.println(Max);
		System.out.println(Min);
	}
	public static void dfs(int num, int idx) {
		// TODO Auto-generated method stub
		if(idx == N) {
			Max = Math.max(Max, num);
			Min = Math.min(Min, num);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if(operator[i]>0) {
				
				operator[i]--;
				
				switch(i) {
				case 0 : dfs(num+number[idx],idx+1); break;
				case 1 : dfs(num-number[idx],idx+1); break;
				case 2 : dfs(num*number[idx],idx+1); break;
				case 3 : dfs(num/number[idx],idx+1); break;
				}
				
				operator[i]++;
			}
		}
	}

}
