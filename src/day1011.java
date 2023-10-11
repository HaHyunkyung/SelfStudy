import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1011 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken(" "));
			int j = Integer.parseInt(st.nextToken(" "));
			int x = Integer.parseInt(st.nextToken(" ")); //시작좌표 x
			int y = Integer.parseInt(st.nextToken(" ")); //시작좌표 y
			int[] play = new int[Integer.parseInt(st.nextToken(" "))];
		
		int[][] xy = new int[x][y];
		
		for(int k=0; k<(x*y); k++) {
			st = new StringTokenizer(br.readLine());
			xy[k][0] = Integer.parseInt(st.nextToken(" "));
			xy[k][1] = Integer.parseInt(st.nextToken(" "));
		}
		 
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()==true) {
			int in=0;
			play[in] = Integer.parseInt(st.nextToken(" "));
			in++;
		}
		
		int[][] dice = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
		ArrayList<Integer> answer = new ArrayList<Integer>();
		//출력은 4행 2열만 함
		
		//지도 
		int xline = 0;
		int yline = 0;
		
		for(int h=0; h< play.length; h++) {
			int temp = 0;
			if(play[h]==1) {
				temp = dice[1][2];
				dice[1][2] = dice[1][1];
				dice[1][1] = dice[1][0];
				dice[1][0] = temp;
		
			}else if(play[h]==2) {
				temp = dice[1][0];
				dice[1][0] = dice[1][1];
				dice[1][1] = dice[1][2];
				dice[1][2] = temp;
				
			}else if(play[h]==3) {
				temp = dice[0][1];
				dice[0][1] = dice[1][1];
				dice[1][1] = dice[2][1];
				dice[2][1] = dice[3][1];
				dice[3][1] = temp;
				
			}else if(play[h]==4) {
				temp = dice[3][1];
				dice[3][1] = dice[2][1];
				dice[2][1] = dice[1][1];
				dice[1][1] = dice[0][1];
				dice[0][1] = temp;
				
			}
		}
		
	}

}
