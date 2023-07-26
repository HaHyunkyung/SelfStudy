import java.util.*;

public class day0726 {
	
	static List<String> answerList = new ArrayList<>();
	static Map<String, Integer> hashMap = new HashMap<>();
	
	public static String[] main(String[] args) {
		// TODO Auto-generated method stub
		String[] orders = {"ABCFG","AC","CDE","ACDE","BCFG","ACDEH"};
		int[] course = {2,3,4};
		 for (int i = 0; i < orders.length; i++) {
	            char[] arr = orders[i].toCharArray();
	            Arrays.sort(arr);
	            orders[i] = String.valueOf(arr);
	        }

	        // 2. �� order�� �������� courseLength ��ŭ�� ���� �����
	        for (int courseLength : course) {
	            for (String order : orders)
	                combination("", order, courseLength);

	            // 3. ���� ���� ���� answer�� ����
	            if (!hashMap.isEmpty()) {
	                List<Integer> countList = new ArrayList<>(hashMap.values());
	                int max = Collections.max(countList);

	                if (max > 1)
	                    for (String key : hashMap.keySet())
	                        if (hashMap.get(key) == max)
	                            answerList.add(key);
	                hashMap.clear();
	            }
	        }

	        Collections.sort(answerList);
	        String[] answer = new String[answerList.size()];
	        for (int i = 0; i < answer.length; i++)
	            answer[i] = answerList.get(i);

	        return answer;
	    }

	    public static void combination(String order, String others, int count) {
	        // Ż�� ���� : count == 0
	        if (count == 0) {
	            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
	            return;
	        }

	        // 0���� length���� ����
	        for (int i = 0; i < others.length(); i++)
	            combination(order + others.charAt(i), others.substring(i + 1), count - 1);
	}

}
