
public class day0805 {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int brown = 10, yellow = 2;
        int sum = brown + yellow;
        //가로 세로는 3 이상이여야함
        for(int i=3; i<sum;i++){
            int j=sum/i; //약수 구하기
            //3 이상이고 약수인지 확인
            if(sum%i==0&&j>=3){
                int col = Math.max(i,j); //i,j중에 큰게 가로
                int row = Math.min(i,j);//작은게 세로
                int center = (col-2)*(row-2);//가운데 겨자색은 (가로-2)*(세로-2)의 값과 같음
                //주어진 겨자색과 구한 겨자색 값이 같다면
                if(center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
	}

}
