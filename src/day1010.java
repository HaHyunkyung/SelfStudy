import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1010 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int room = Integer.parseInt(br.readLine());
		int[] people = new int[room];
		String peoplest = br.readLine();
		StringTokenizer st = new StringTokenizer(peoplest," ");
		for(int i=0; i<room; i++) {
			
			people[i] =  Integer.parseInt(st.nextToken());
		}
		String BC = br.readLine();
		int B  = Integer.parseInt(BC.split(" ")[0]);
		int C = Integer.parseInt(BC.split(" ")[1]);
		
		long count = 0;
		for(int i=0; i<room; i++) {
			int rest = people[i]-B;
			count++;
			if(rest<=0) {
				continue;
			}else {
				if(rest % C==0)
					count = count + (rest/C);
				else
					count = count + (rest/C) +1;
			}
		}
		System.out.println(count);
		
	}
	

}
