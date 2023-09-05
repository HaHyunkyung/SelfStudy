
public class day0903 {
static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int answer = 0;
		dfs(numbers,target, 0,0);
		answer = count;
		System.out.println(answer);
	}

	private static void dfs(int[] numbers, int target, int idx, int sum) {
		// TODO Auto-generated method stub
		if(idx == numbers.length) {
			if(sum == target) count++;
		}else {
			dfs(numbers, target, idx+1, sum+numbers[idx]);
			dfs(numbers, target, idx+1, sum-numbers[idx]);
		}
	}

}
