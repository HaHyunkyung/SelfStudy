import java.util.*;
public class day0727 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		 
		 String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB","13:00,13:05,WORLD,ABCDEF"};
		 String m = "ABCDEFG";
		 String answer = "(None)";
	        int title = musicinfos.length;
	        
	        LinkedHashMap<String,Integer> Time = new LinkedHashMap<String, Integer>();
	        LinkedHashMap<String,String> Melody = new LinkedHashMap<String, String>();
	       
	        //�׿��� ����� ��ε��߿��� #���� �ֵ��� �ҹ��ڷ� �ٲ���
	        for(int i=0; i<m.length()-1;i++){
	            StringBuilder sb = new StringBuilder(m);
	            if(m.charAt(i+1)=='#'){
	                sb.setCharAt(i,Character.toLowerCase(m.charAt(i)));
	                m = sb.toString();
	            }
	        }
	        System.out.println(m);
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
	            //��ε��߿��� #�پ��ִ� �ֵ��� �ҹ��ڷ� �ٲ���
	        for(int j=0; j<remelody.length()-1;j++){
	            StringBuilder sb = new StringBuilder(remelody);
	            if(remelody.charAt(j+1)=='#'){
	                sb.setCharAt(j,Character.toLowerCase(remelody.charAt(j)));
	                remelody = sb.toString();
	            }
	        }
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
	            int maxtime = 0;
	            //��ε� ��
	            for(String key : Melody.keySet()){
	            if(Melody.get(key).indexOf(m)!=-1){
	               if(Time.get(key)>maxtime)
	                   maxtime = Time.get(key);
	                   answer = key;
	                   
	            }
	            }
	            
	        return answer;
	}

}
