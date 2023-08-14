import java.util.*;
public class day0813 {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		String[] phoneBook = {"119", "97674223", "1195524421"};
		 Map<String, Integer> map = new HashMap<>();

	     
	        for (int i = 0; i < phoneBook.length; i++) 
	            map.put(phoneBook[i], i);
	        
	        for (int i = 0; i < phoneBook.length; i++)
	            for (int j = 0; j < phoneBook[i].length(); j++)
	                if (map.containsKey(phoneBook[i].substring(0, j)))
	                    return false;

	        return true;
	}

}
