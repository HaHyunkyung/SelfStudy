import java.util.*;
public class day0811 {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		 int size = progresses.length;
	        int[] you = new int[size];
	        ArrayList<Integer> answer= new ArrayList<>();
	        Stack<Integer> days = new Stack<>();
	        int cnt = 1;
	        for(int i=0;i<size;i++){
	            int leftday = 100-progresses[i];
	            int leftday2 = leftday/speeds[i];
	            if(leftday%speeds[i] !=0)
	                leftday2++;
	            if(i==0)
	                days.push(leftday2);
	            else if(days.peek()>=leftday2)
	                cnt++;
	            else if(days.peek()<leftday2){
	                answer.add(cnt);
	                days.pop();
	                days.push(leftday2);
	                cnt = 1;
	            } 
	            if(i==size-1){
	                answer.add(cnt);
	            }
	        }
	        int[] answer2 = new int[answer.size()];
	        for(int i=0; i<answer.size();i++){
	            answer2[i] = answer.get(i);
	        }
	        return answer2;
	}	

}
