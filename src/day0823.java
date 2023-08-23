
public class day0823 {
	public static void mathmatic(int start, int fin) {
		int answer = 0;
		for(int i=start; i<=fin; i++) {
			answer += i;
		}
		System.out.println(answer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int fin = 10;
		mathmatic(start, fin);
		
	}

}
