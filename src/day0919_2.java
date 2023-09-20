import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day0919_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] check = new int[26];
		
		for(int i=0; i<26; i++) {
			check[i]=-1;
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(check[ch-'a'] == -1) {
				check[ch-'a'] = i;
			}
		}
		for(int val: check) {
			System.out.print(val+" ");
		}
		
	}

}
