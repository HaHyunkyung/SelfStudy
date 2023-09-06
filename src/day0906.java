import java.util.*;
public class day0906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {9,1,5,3,6,2};
		int[] answer = new int[numbers.length];
		Stack<Integer> st =  new Stack<>();
        for(int i=numbers.length-1; i>=0; i--){
            while(!st.isEmpty()){
                if(st.peek()>numbers[i]){
                    answer[i] = st.peek();
                    break;
                }else{
                    st.pop();
                }
            }
            if(st.isEmpty()){
                    answer[i]=-1;
                }
                st.push(numbers[i]);
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
	}

}
