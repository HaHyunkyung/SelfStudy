import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day0921 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] alpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0; i<alpha.length; i++) {
			if(str.contains(alpha[i])) {
				str = str.replace(alpha[i], "!");
			}
		}
		System.out.println(str);
		System.out.println(str.length());
	}

}
