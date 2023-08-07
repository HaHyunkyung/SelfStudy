import java.util.*;

public class day0807 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		 int answer = 0;
		 int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		 int k =6;
	        Arrays.sort(tangerine);
	        int size = tangerine.length;
	        int boxsize = tangerine[size-1];
	        int box[] = new int[size];
	        
	        for(int i=1; i<=boxsize; i++){
	            int cnt = 0;
	            for(int j=0; j<size; j++){
	                if(tangerine[j]==i)
	                    cnt++;
	            }
	            box[i]=cnt;
	        }
	        int cnt = 0;
	        while(true){
	            int max = 0;
	            for(int i=0; i<boxsize;i++){
	                if(box[i]>max){
	                    max = box[i];
	                    box[i] = 0;
	                }
	            }
	            if(max+cnt>=k){
	                answer++;
	                break;
	            }
	            else
	                cnt += max;
	                answer++;
	        }
	        return answer;
	}

}
