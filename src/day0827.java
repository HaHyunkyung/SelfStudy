import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class day0827 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	public static int factorial(int N) {
		if(N<=1) return 1;
		//��ʹ� ���� �޼ҵ� �ȿ��� �ٽ� ȣ���ؾ���
		return N*factorial(N-1);
	}

}
