import java.util.*;
public class day0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {9,1,5,3,6,2};
		int[] answer = new int[6];
		
		for(int i=0; i<numbers.length; i++) {
			boolean flag = false;
			if(i == numbers.length-1) {
				answer[i]=-1;
			}
			else {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[j]>numbers[i]) {
					answer[i]=numbers[j];
					flag = true;
					break;
				}
			}
			}
			if(flag == false)
				answer[i]=-1;
		}
		for(int i=0; i<answer.length; i++) {
		System.out.println(answer[i]);
		}
	}

}
