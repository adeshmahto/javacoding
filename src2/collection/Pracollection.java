package collection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Pracollection {
	
	public static void main(String[] args) {

		  System.out.println(toh(2,1,3,2));
    }

	   public static long toh(int N, int from, int to, int aux) {
	        int temp=N;
	        int Movement=0;
	        if(N==1){
	            System.out.println("move disk "+N+" from rod "+from+" to rod "+ to );
	            return N;
	            
	        }
	        
	        toh(N-1,from,aux,to);
	        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
	        toh(N-1,from,to,aux);
	        N=temp;
	        Movement=(int )Math.pow(2,N)-1;
	        
	        return Movement; 
	        
	      
	    }
	

	};


