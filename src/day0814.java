import java.util.*;
public class day0814 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int K = 7;
		int[] scoville = {1, 2, 3, 9, 10, 12};
		 int answer = 0;
	        PriorityQueue<Integer> que = new PriorityQueue<>();
	        
	        for(int i=0; i<scoville.length; i++){
	            que.add(scoville[i]);
	        }
	        while(que.peek()<K){
	            if(que.size()==1)
	                return -1;
	            que.add(que.poll() + que.poll()*2);
	            answer++;
	        }
	        return answer;
	}

}
