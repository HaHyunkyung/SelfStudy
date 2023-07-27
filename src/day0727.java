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
	            //멜로디 비교
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
