import java.util.*;

public class day0725 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int[] queue1 = {3,2,7,2};
		int[] queue2 = {4,6,5,1};
		 int answer = 0;
	        
	        long total = 0;
	        long q1sum = 0;
	        Queue<Integer> qqu1 = new LinkedList<Integer>();
	        Queue<Integer> qqu2 = new LinkedList<Integer>();
	        for(int i=0; i<queue1.length; i++){
	            total += queue1[i]+queue2[i];
	            q1sum += queue1[i];
	            qqu1.add(queue1[i]);
	            qqu2.add(queue2[i]);
	        }
	        if(total%2==1) 
	            return -1;
	        
	        long target = total/2;
	        
	        while(true){
	            if(answer>(queue1.length+queue2.length)*2)
	                return -1;
	            if(q1sum==target)
	                break;
	            else if(q1sum>target){
	                q1sum-=qqu1.peek();
	                qqu2.add(qqu1.poll());
	            }else{
	                q1sum += qqu2.peek();
	                qqu1.add(qqu2.poll());
	            }
	            answer++;
	            
	        }
	        return answer;
	}

}
