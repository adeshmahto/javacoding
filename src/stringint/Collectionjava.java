package stringint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectionjava {

	public static void main(String[] args) {
		
		Collection values= new ArrayList();
		values.add(34);
		values.add(56);
		
		Iterator it =values.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
