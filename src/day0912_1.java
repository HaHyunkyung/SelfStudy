import java.util.*;

public class day0912_1 {
	public static void main(String[] args) {
		//��������
		PriorityQueue<Integer> PrLow = new PriorityQueue<>();
		//��������
		PriorityQueue<Integer> PrHigh = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=1; i<=10; i++) {
		PrLow.add(i);
		PrHigh.add(i);
		}
		//ù��° �� ���� ����ִٸ� ���� �߻�
		PrLow.remove();
		System.out.println(PrLow.peek());
		System.out.println(PrHigh.peek());
	}
}
