import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class day0920_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = N;
		for(int i=0; i<N; i++) {
			boolean[] arr = new boolean[26];
			String str = br.readLine();
			
			arr[(int)str.charAt(0)-97] = true;
			
			for(int j=1; j<str.length(); j++) {
				char c = str.charAt(j);
				
				if(c==str.charAt(j-1)) continue;
				
				if(arr[(int)c-97]) {
					count--;
					break;
				}
				arr[(int)c-97] = true;
			}
		}
		System.out.println(count);
	}

}
