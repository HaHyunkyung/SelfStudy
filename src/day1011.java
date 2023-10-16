import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1011 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()); //시작좌표 x
			int y = Integer.parseInt(st.nextToken()); //시작좌표 y
			int[] play = new int[Integer.parseInt(st.nextToken())];
		
		int[][] xy = new int[i][j];
		
		for(int k=0; k<i; k++) {
			st = new StringTokenizer(br.readLine());
			for(int u=0; u<j;u++) {
				xy[k][u] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		for(int p=0; p<play.length;	p++) {
			play[p] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dice = {{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		//출력은 4행 2열만 함
		for(int h=0; h< play.length; h++) {
			int temp = 0;
			if(play[h]==1) {
				if(x<j) {
				temp = dice[1][2];
				dice[1][2] = dice[1][1];
				dice[1][1] = dice[1][0];
				dice[1][0] = temp;
				x++;
					if(xy[x][y] == 0) {
						xy[x][y] = dice[3][1];
					}
					else {
						dice[3][1] = xy[x][y];
						xy[x][y] = 0;
					}
				answer.add(dice[3][1]);
				}
				else
					continue;
		
			}else if(play[h]==2) {
				if(x>1) {
				temp = dice[1][0];
				dice[1][0] = dice[1][1];
				dice[1][1] = dice[1][2];
				dice[1][2] = temp;
				x--;
					if(xy[x][y] == 0) {
						xy[x][y] = dice[3][1];
					}
					else {
						dice[3][1] = xy[x][y];
						xy[x][y] = 0;
					}
				answer.add(dice[3][1]);
				}
				else
					continue;
			}else if(play[h]==3) {
				if(y>1) {
				temp = dice[0][1];
				dice[0][1] = dice[1][1];
				dice[1][1] = dice[2][1];
				dice[2][1] = dice[3][1];
				dice[3][1] = temp;
				y--;
					if(xy[x][y]==0) {
						xy[x][y] = dice[3][1];
					}
					else {
						dice[3][1] = xy[x][y];
						xy[x][y] = 0;
					}
				answer.add(dice[3][1]);
				}
				else
					continue;
			}else if(play[h]==4) {
				if(y<i) {
				temp = dice[3][1];
				dice[3][1] = dice[2][1];
				dice[2][1] = dice[1][1];
				dice[1][1] = dice[0][1];
				dice[0][1] = temp;
				y++;
					if(xy[x][y]==0) {
						xy[x][y] = dice[3][1];
					}
					else {
						dice[3][1] = xy[x][y];
						xy[x][y] = 0;
					}
				answer.add(dice[3][1]);	
				}
				else
					continue;
			}
		}
		for(int m=0; m<answer.size(); m++) {
			System.out.println(answer.get(m));
		}
		
	}

}
