import java.util.*;

public class day0825 {
	
	public static void cutting(int[] topping, int size) {
		int answer = 0;
		HashSet<Integer> first = new HashSet<>();
		HashMap<Integer, Integer> second = new HashMap<>();
		
		first.add(topping[0]);
		for(int i=1; i<size; i++) {
			second.put(topping[i], second.get(topping[i])-1);
			if(second.get(topping[i])==0) {
				second.remove(topping[i]);
			}
			if(first.size()==second.size())
				answer++;
			
		}
		System.out.println(answer);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] topping = {1,2,1,3,1,4,1,2};
		int size = topping.length;
		
		cutting(topping,size);
		
	}

}
