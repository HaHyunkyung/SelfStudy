import java.util.*;

public class day0914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int[] answer = new int[places.length];
		
		//대기실 별로 쪼개기
		for(int i=0; i<places.length; i++) {
			String[][] room = new String[5][5];
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					room[j][k] = places[i][j];
					System.out.println(room[j][k]);
				}
			}
		}
	}

}
