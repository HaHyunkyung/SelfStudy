import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class day0927 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int day[] = new int[num];
		int pay[] = new int[num];
		for(int i=0; i<num; i++) {
			String schedule = br.readLine();
			day[i] = Integer.parseInt(schedule.split(" ")[0]);
			pay[i] = Integer.parseInt(schedule.split(" ")[1]);
		}
		
	}

}
