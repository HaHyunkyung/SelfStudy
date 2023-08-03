
public class day0803 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		  int answer = 0;
		  int n = 15;
	        String bs = Integer.toBinaryString(n);
	        char[] bsArray = bs.toCharArray();
	        int bsnum=0;
	        
	        for(int i=0; i<bsArray.length; i++){
	            if(bsArray[i]=='1')
	                bsnum++;
	        }
	        int num =n;
	        while(true){
	            num++;
	            String upgrade = Integer.toBinaryString(num);
	            char[] upgradeArray = upgrade.toCharArray();
	            int upnum=0;
	             for(int i=0; i<upgradeArray.length; i++){
	                if(upgradeArray[i]=='1')
	                    upnum++;
	                 
	        }
	            if(upnum == bsnum){
	                answer = num;
	                break;
	            }
	        }
	        return answer;
	}

}
