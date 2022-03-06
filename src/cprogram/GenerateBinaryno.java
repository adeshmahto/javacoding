package cprogram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryno {

	public static void main(String[] args) {
		
			genB(10);
	}
	
 public static void genB(int n) {
	 ArrayList<String> result=new ArrayList<>();
	 Queue<String> nums=new LinkedList<>();
	 
	 nums.add("1");
	 for(int i=0;i<=n;i++) {
		 String temp=nums.peek();
		 result.add(temp);
		 nums.remove();
		 
		 nums.add(temp+"0");
		 nums.add(temp+"1");
	 }
	 int i=0;
	 while(!result.isEmpty()) {
		 System.out.println(result.remove(i));
		 i=i++;
	 }
	 
	 
 }

}
