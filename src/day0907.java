import java.util.*;

public class day0907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		int[][] reservation = new int[book_time.length][2];
		
		int answer = 0;
		//예약시간, 지속시간 순으로 int 배열에 저장
		for(int i=0; i<book_time.length; i++) {
			for(int j=0; j<book_time[i].length; j++) {
				int hour =Integer.valueOf( book_time[i][j].split(":")[0])*60;
				int minute = Integer.valueOf(book_time[i][j].split(":")[1]);
				if(j==0) {
					reservation[i][j]= hour+minute;
				}
				else {
					int time = hour+minute+10;
					if(time%100>=60) time+=40;
					reservation[i][j]= time;
				}
			}
		}
		//예약시간 빠른순으로 정렬
		Arrays.sort(reservation, (a,b)->{
			if(a[0]>b[0]) return 1;
			else if(a[0]<b[0]) return -1;
			else {
				if(a[1]>b[1]) return 1;
				else return -1;
			}
		});
		//항상 가장 빨리 비는 방을 찾기 위해 PriorityQueue를 사용함
		PriorityQueue<Integer> rooms = new PriorityQueue<>();
		//방 몇개 필요한지 찾기(배열 중 첫번째 값은 비교 필요 없으므로 빼고 시작함)
		for(int[] timeArr : reservation) {
			if(rooms.size() == 0) {
				//첫 예약일 경우 종료 시간 저장
				rooms.add(timeArr[1]);
				continue;
			}
			//두 번째 예약일 경우 빈 방이 있으면 해당 방에 넣고, 아니면 새 방 배정
			int earlyList = rooms.peek();
			if(timeArr[0] >= earlyList) {
				rooms.poll();
				rooms.add(timeArr[1]);
			}
			else {
				rooms.add(timeArr[1]);
			}
		}
		answer = rooms.size();
		System.out.println(answer);
	}

}
