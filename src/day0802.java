import java.util.*;
public class day0802 {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Character> stack = new Stack<>();
		 String s = "(()))(";
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)=='(')
	                stack.push('(');
	            else if(s.charAt(i)==')'){
	                if(stack.isEmpty()){
	                    return false;
	                }
	                stack.pop();
	            }
	        }     


	        return stack.isEmpty();
	}

}
