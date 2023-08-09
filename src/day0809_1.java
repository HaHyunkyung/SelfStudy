import java.util.*;

public class day0809_1 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
        int days = 10;
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int[] number = {3, 2, 2, 2, 1};
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            map.put(want[i],number[i]);
        }
        
        for(int i=0; i<discount.length - days + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();
            
            for(int j=0; j<days; j++){
                dMap.put(discount[i+j], dMap.getOrDefault(discount[i+j],0)+1);
                Boolean isIdentical = true;
                
                for(String key: map.keySet()){
                    if(map.get(key)!=dMap.get(key)){
                        isIdentical = false;
                        break;
                    }
                }
                answer += isIdentical ? 1:0;
            }
        }
        return answer;
	}

}
