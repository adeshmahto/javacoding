package dsa;

import java.util.Arrays;
import java.util.Collections;

public class Dsa5 {

	public static void main(String[] args) {
	
	long A=11;
	
    int count = 0;
    while((A & 1) == 0 && A>0){
        count++;
        A = A/2;
    }	System.out.println(count);
	}

	
	}
	


