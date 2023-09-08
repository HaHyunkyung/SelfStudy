import java.util.*;

public class day0907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		int[][] reservation = new int[book_time.length][2];
		
		int answer = 0;
		//����ð�, ���ӽð� ������ int �迭�� ����
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
		//����ð� ���������� ����
		Arrays.sort(reservation, (a,b)->{
			if(a[0]>b[0]) return 1;
			else if(a[0]<b[0]) return -1;
			else {
				if(a[1]>b[1]) return 1;
				else return -1;
			}
		});
		//�׻� ���� ���� ��� ���� ã�� ���� PriorityQueue�� �����
		PriorityQueue<Integer> rooms = new PriorityQueue<>();
		//�� � �ʿ����� ã��(�迭 �� ù��° ���� �� �ʿ� �����Ƿ� ���� ������)
		for(int[] timeArr : reservation) {
			if(rooms.size() == 0) {
				//ù ������ ��� ���� �ð� ����
				rooms.add(timeArr[1]);
				continue;
			}
			//�� ��° ������ ��� �� ���� ������ �ش� �濡 �ְ�, �ƴϸ� �� �� ����
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
