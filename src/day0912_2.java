import java.util.*;
public class day0912_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1231234";
		int k =3;
		StringBuilder answer = new StringBuilder("");
		int num = number.length() - k;//남겨야 하는 숫자의 갯수
		int start = 0;
		
		while(start < number.length() && answer.length() != num) {
			int leftNum = k + answer.length() + 1;
			int max = 0;
			for(int j= start; j<leftNum; j++) {
				if(max<number.charAt(j)-'0') {
					max = number.charAt(j)-'0';
					start = j + 1;
				}
			}
			answer.append(Integer.toString(max));
		}
		System.out.println(answer);
		
		
		
	}

}
