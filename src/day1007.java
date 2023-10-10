import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1007 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		        
		        ArrayList<Integer>  alpha= new ArrayList<Integer>();
		        int ind = 1; 
		        HashMap<String, Integer> dic = new HashMap<String,Integer>();
		        for(char i = 'A'; i<='Z'; i++){
		            dic.put(i+"",ind++);
		        }
		        int size = msg.length();
		        for(int i =0; i< size; i++){
		            int a = 1;
		            while(i+a<=size && dic.containsKey(msg.substring(i,i+a))){
		                a++;
		            }
		            if(i+a>size){
		                alpha.add(dic.get(msg.substring(i)));
		                break;
		            }
		            alpha.add(dic.get(msg.substring(i,i+a-1)));
		            dic.put(msg.substring(i,i+a),ind++);
		            if(a>1)i+=a-2;
		        }
		        int outsize = alpha.size();
		        for (int i = 0; i < outsize; i++) {
					System.out.println(alpha.get(i));
				}
		
		
	}

}
