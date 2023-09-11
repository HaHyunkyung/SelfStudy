import java.util.*;

public class day0909 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3};
		int[] answer = new int[n.length];
		List<Integer> list = new ArrayList<>();
		int k=5;
		
		long f = 1;
		for(int i=1; i<=n.length; i++) {
			list.add(i);
			f *=i;
		}
		k--;
		int idx = 0;
		while(idx<n.length) {
			f /= n.length -idx;
			answer[idx++] = list.remove((int)(k/f));
			k%=f;
		}
		for(int i=0; i<answer.length;i++) {
		System.out.print(answer[i]);
		}
	}

}
