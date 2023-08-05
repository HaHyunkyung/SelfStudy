
public class day0806_1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,7,9,11};
		 int answer = 0;
	        int last = arr.length;
	        int num = 0;
	        while(true){
	            num++;
	            int mul = arr[last-1]*num;
	            int temp=0;
	            for(int i=0; i<last; i++){
	                if(mul%arr[i]==0)
	                    temp++;
	            }
	            if(temp==last){
	                answer = mul;
	                break;
	            }
	        }
	        return answer;
	}

}
