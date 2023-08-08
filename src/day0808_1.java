import java.util.*;
public class day0808_1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		 int answer = 0;
		 int[] citations = {3, 0, 6, 1, 5};
	        Arrays.sort(citations);
	        
	        for(int i=0; i<citations.length; i++){
	            int h = citations.length - i;
	            
	            if(citations[i] >= h){
	                answer = h;
	                break;
	            }
	        }
	        return answer;
	}

}
