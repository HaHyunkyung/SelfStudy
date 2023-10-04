import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1004 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
		}
		Arrays.sort(input);
		System.out.println(sum/5);
		System.out.println(input[2]);
	}

}
