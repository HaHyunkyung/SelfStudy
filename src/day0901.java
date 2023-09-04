import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day0901 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(N));
	}
	 static int fibonacci(int N) {
		if(N==0) return 0;
		if(N ==1) return 1;
		return fibonacci(N-1)+fibonacci(N-2);
	}

}
