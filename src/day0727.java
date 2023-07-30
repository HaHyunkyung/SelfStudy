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
	       
	        //네오가 기억한 멜로디중에서 #붙은 애들은 소문자로 바꿔줌
	        for(int i=0; i<m.length()-1;i++){
	            StringBuilder sb = new StringBuilder(m);
	            if(m.charAt(i+1)=='#'){
	                sb.setCharAt(i,Character.toLowerCase(m.charAt(i)));
	                m = sb.toString();
	            }
	        }
	        System.out.println(m);
	        //해쉬에 (제목, 시간) (제목, 멜로디) 저장
	        for(int i=0; i<title;i++){
	            String start = musicinfos[i].split(",")[0];//시작 시간:분
	            String finish = musicinfos[i].split(",")[1];//끝나는 시간:분
	            int starthour = Integer.parseInt(start.split(":")[0]);//시작 시간
	            int finishhour = Integer.parseInt(finish.split(":")[0]);//끝나는 시간
	            int startminute = Integer.parseInt(start.split(":")[1]);//시작 분
	            int finishminute = Integer.parseInt(finish.split(":")[1]);//끝나는 분
	            int hour = (finishhour-starthour)*60;//끝나는 시간 분으로 바꿔줌
	            int minute = (finishminute - startminute)+hour;//재생시간
	            int play = musicinfos[i].split(",")[3].length();//맬로디 몇개인지
	            String remelody = musicinfos[i].split(",")[3];//멜로디
	            //멜로디중에서 #붙어있는 애들은 소문자로 바꿔줌
	        for(int j=0; j<remelody.length()-1;j++){
	            StringBuilder sb = new StringBuilder(remelody);
	            if(remelody.charAt(j+1)=='#'){
	                sb.setCharAt(j,Character.toLowerCase(remelody.charAt(j)));
	                remelody = sb.toString();
	            }
	        }
	            //플레이시간보다 멜로디 갯수 작으면 멜로디 갯수랑 플레이시간 같게 맞춰줌
	            if(play<=minute){
	              remelody =  remelody.repeat(minute/play) + remelody.substring(0,minute%play);
	            }
	            else{
	                remelody = remelody.substring(0,minute%play);
	            }
	            Time.put(musicinfos[i].split(",")[2],minute);//해쉬에 제목, 시간
	            Melody.put(musicinfos[i].split(",")[2],remelody);//해쉬에 제목, 멜로디
	        }
	              Set<String> keySet = Melody.keySet();
	        for (String key : keySet) {
	            System.out.println(key + " : " + Melody.get(key));
	        }
	            int maxtime = 0;
	            //멜로디 비교
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
