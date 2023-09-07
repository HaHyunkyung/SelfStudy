import java.util.*;

public class day0907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		int[][] reservation = new int[book_time.length][2];
		boolean flag = true;
		
		for(int i=0; i<book_time.length; i++) {
			for(int j=0; j<book_time[i].length; j++) {
				int hour =Integer.valueOf( book_time[i][j].split(":")[0])*60;
				int minute = Integer.valueOf(book_time[i][j].split(":")[1]);
				reservation[i][j]= hour+minute;
				System.out.println(reservation[i][j]);
			}
		}
		
	}

}
