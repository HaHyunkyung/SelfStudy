
public class day0805 {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int brown = 10, yellow = 2;
        int sum = brown + yellow;
        //���� ���δ� 3 �̻��̿�����
        for(int i=3; i<sum;i++){
            int j=sum/i; //��� ���ϱ�
            //3 �̻��̰� ������� Ȯ��
            if(sum%i==0&&j>=3){
                int col = Math.max(i,j); //i,j�߿� ū�� ����
                int row = Math.min(i,j);//������ ����
                int center = (col-2)*(row-2);//��� ���ڻ��� (����-2)*(����-2)�� ���� ����
                //�־��� ���ڻ��� ���� ���ڻ� ���� ���ٸ�
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
