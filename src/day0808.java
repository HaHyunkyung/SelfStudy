import java.util.*;
public class day0808 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer> set = new HashSet<>();
	        int[] elements = {7,9,1,1,4};
	        
	        int k=0;
	        while(k<=elements.length){
	            for(int i=0;i<elements.length; i++){
	                int sum = 0;
	                for(int j=i; j<i+k; j++){
	                sum+=elements[j%elements.length];
	                }
	                set.add(sum);
	            }
	             k++;
	        }
	        return set.size()-1;
	}

}
