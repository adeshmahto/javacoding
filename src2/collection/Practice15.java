package collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Practice15 {

	

	public static void main(String[] args) {
System.out.println(palin("abba",0,3));
	
	}
	static boolean  palin(String s,int l,int r) {
		
		if(l>=r) {
			return true;
		}
		if(s.charAt(l)!=s.charAt(r)) {
			return false;
		}
		else {
			return palin(s,l+1,r-1);
		}
	}

}
