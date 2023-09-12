import java.util.*;

public class day0912_1 {
	public static void main(String[] args) {
		//오름차순
		PriorityQueue<Integer> PrLow = new PriorityQueue<>();
		//내림차순
		PriorityQueue<Integer> PrHigh = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=1; i<=10; i++) {
		PrLow.add(i);
		PrHigh.add(i);
		}
		//첫번째 값 제거 비어있다면 예외 발생
		PrLow.remove();
		System.out.println(PrLow.peek());
		System.out.println(PrHigh.peek());
	}
}
