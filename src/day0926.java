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
		
		//��� �������� Ű�� ������
		for(int i=0; i<9; i++) {
			nanjang[i] = Integer.parseInt(br.readLine());
			sum += nanjang[i];
		}
		//2�� ���� 100�� �Ǵ� ��¥ ������ 2���� ã��
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
