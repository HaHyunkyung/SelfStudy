import java.util.*;
public class day0731 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		  String answer = "";
		  String s = "3people unFollowed me";
	        String[] ssplit = s.split(" ");
	        for(int i=0; i<ssplit.length; i++){
	            if(ssplit[i].length() == 0)
	                answer += " ";
	            else{
	                answer += ssplit[i].substring(0,1).toUpperCase();
	                answer += ssplit[i].substring(1, ssplit[i].length()).toLowerCase();
	                answer += " ";
	            }
	        }
	        if(s.substring(s.length()-1, s.length()).equals(" "))
	        return answer;
	        
	        return answer.substring(0,answer.length()-1);
	}

}
