
public class day0812 {
	 static boolean[] visited;  
	  static int count = 0;
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int k=80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		 visited = new boolean[dungeons.length];  
	        dfs(0, k, dungeons);  
	        return count;  
	    }  
	      
	    private static void dfs(int depth, int fatigue, int[][] dungeons){  
	        for (int i = 0; i < dungeons.length; i++){  
	            if (visited[i] || dungeons[i][0] > fatigue) {  
	                continue;  
	            }  
	            visited[i] = true;  
	            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);  
	            visited[i] = false;  
	        }  
	        count = Math.max(count, depth);  
	}

}
