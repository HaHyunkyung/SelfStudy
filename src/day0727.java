import java.util.*;
public class day0727 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		 String answer = "";
		 String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB","13:00,13:05,WORLD,ABCDEF"};
		 String m = "ABCDEFG";
	        int title = musicinfos.length;
	        HashMap<String,Integer> Time = new HashMap<String, Integer>();
	        HashMap<String,String> Melody = new HashMap<String, String>();
	        //�ؽ��� (����, �ð�) (����, ��ε�) ����
	        for(int i=0; i<title;i++){
	            String start = musicinfos[i].split(",")[0];//���� �ð�:��
	            String finish = musicinfos[i].split(",")[1];//������ �ð�:��
	            int starthour = Integer.parseInt(start.split(":")[0]);//���� �ð�
	            int finishhour = Integer.parseInt(finish.split(":")[0]);//������ �ð�
	            int startminute = Integer.parseInt(start.split(":")[1]);//���� ��
	            int finishminute = Integer.parseInt(finish.split(":")[1]);//������ ��
	            int hour = (finishhour-starthour)*60;//������ �ð� ������ �ٲ���
	            int minute = (finishminute - startminute)+hour;//����ð�
	            int play = musicinfos[i].split(",")[3].length();//�ȷε� �����
	            String remelody = musicinfos[i].split(",")[3];//��ε�
	            //�÷��̽ð����� ��ε� ���� ������ ��ε� ������ �÷��̽ð� ���� ������
	            if(play<=minute){
	              remelody =  remelody.repeat(minute/play) + remelody.substring(0,minute%play);
	            }
	            else{
	                remelody = remelody.substring(0,minute%play);
	            }
	            Time.put(musicinfos[i].split(",")[2],minute);//�ؽ��� ����, �ð�
	            Melody.put(musicinfos[i].split(",")[2],remelody);//�ؽ��� ����, ��ε�
	        }
	              Set<String> keySet = Melody.keySet();
	        for (String key : keySet) {
	            System.out.println(key + " : " + Melody.get(key));
	        }
	            //��ε� ��
	            for(String key : Melody.keySet()){
	                System.out.println(Melody.get(key).indexOf(m));
	            if(Melody.get(key).indexOf(m)!=-1){
	                return key;
	               
	            }else{
	                answer = "None";
	            }
	            }
	            
	        return answer;
	}

}
