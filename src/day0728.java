import java.util.*;
public class day0728 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1 2 3 4";
		 String answer = "";
	        ArrayList<Integer> math = new ArrayList<Integer>();
	        String[] str = s.split(" ");
	        for(int i=0;i<str.length;i++){
	            math.add(Integer.parseInt(str[i]));
	        }
	        answer = Collections.min(math)+ " "+ Collections.max(math);
	        return answer;
	}

}
