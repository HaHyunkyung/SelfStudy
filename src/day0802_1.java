
public class day0802_1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		 int answer = 0;
		 int n =15;
	        for(int i=1; i<=n;i++){
	            int sum=0;
	            for(int j=i;j<=n;j++){
	                sum+=j;
	                
	                if(sum==n){
	                    answer++;
	                    break;
	                }else if(sum>n){
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	}

}
