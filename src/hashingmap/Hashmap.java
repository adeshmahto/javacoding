package hashingmap;




import java.util.*;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
		Map<String , Integer> number =new HashMap<>();
		number.put("One", 1);
		number.put("two", 2);
		number.put("Three", 3);
		//number.put("One", 45);         // updated value;
		//number.putIfAbsent("One", 45);  // it will check if the one is not present then it will update o.w not;
		
		System.out.println(number.get("One"));
		System.out.println(number.containsKey("One"));
		number.replace("One",1,10);               // it replace the old value to new value
		
		System.out.println(number);
		System.out.println(number.keySet());     // print the key 
		System.out.println(number.entrySet());  
		
		Set<Entry<String, Integer>> entries = number.entrySet();
		
		for(Entry<String , Integer>entry: entries) {          // tranvers the map
			entry.setValue(entry.getValue() *100 );              // it going to multiple by 100
		}
		System.out.println(number);
		


	}
	

}
