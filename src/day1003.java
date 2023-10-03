import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1003 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] xy = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<6; i++) {
			xy[i] = Integer.parseInt(st.nextToken());
			System.out.println(xy[i]);
		}
	}

}
