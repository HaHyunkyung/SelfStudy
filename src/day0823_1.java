import java.util.*;
public class day0823_1 {
	public static void chat(String[] record) {
		ArrayList<String> ans = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        String warning;
        String[] name = new String[3];
        for(int i=0; i<record.length; i++){
            name = record[i].split(" ");
            if(name[0].equals("Leave")){
                continue;
            }else
            map.put(name[1],name[2]);
        }
        String[] check = new String[3];
        for(int i=0; i<record.length; i++){
            check = record[i].split(" ");
            String key = check[1];
            if(check[0].equals("Enter")){
                warning = map.get(key)+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
                ans.add(warning);
            }
            else if(check[0].equals("Leave")){
                warning = map.get(key)+"´ÔÀÌ ³ª°¬½À´Ï´Ù.";
                ans.add(warning);
            }else{
                continue;
            }
        }
        String[] answer = ans.toArray(new String[0]);
        for(int i=0;i<answer.length;i++) {
        	System.out.println(answer[i]);
        	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		chat(record);
		
	}

}
