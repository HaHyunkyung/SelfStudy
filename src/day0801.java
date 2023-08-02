import java.util.*;

public class day0801 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[] A = {1,4,2};
		int[] B = {5,4,4};
        Integer[] b = new Integer[B.length];
        
        for(int i=0; i<b.length; i++){
            b[i]=B[i];
        }
        Arrays.sort(A);
        Arrays.sort(b,Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++){
            answer += A[i]*b[i];
        }

        return answer;
	}

}
