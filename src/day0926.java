import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class day0926 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nanjang = new int[9];
		int sum = 0;
		
		//모든 난쟁이의 키를 더해줌
		for(int i=0; i<9; i++) {
			nanjang[i] = Integer.parseInt(br.readLine());
			sum += nanjang[i];
		}
		//2명씩 빼서 100이 되는 가짜 난쟁이 2명을 찾음
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9;j++) {
				if(sum-nanjang[i]-nanjang[j]==100) {
					nanjang[i]=0;
					nanjang[j]=0;
					Arrays.sort(nanjang);
					for(int k=2; k<9; k++) {
						System.out.println(nanjang[k]);
					}
				}
			}
		}
	}

}
