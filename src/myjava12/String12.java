package myjava12;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class String12 {

	public static void main(String[] args) {
	
		
		
	
		
		        Scanner sc = new Scanner(System.in);
		        int t=sc.nextInt();
		        while(t-->0)
		        {
		            int n=sc.nextInt();
		            int[] a[],b;
		            a= new int[n][n];
		            b= new int[n];
		            int sum=0;
		            for(int i=0;i<n;i++)
		            {
		                for(int j=0;j<n;j++)
		                {
		                    int p=sc.nextInt();
		                    a[i][j]=p;
		                }
		            }
		            int Max=0;
		            for(int i=0;i<n;i++)
		            {
		                int p=sc.nextInt();
		                b[i]=p;
		            }
		            Complete obj = new Complete();
		            ArrayList<Integer> ans;
		            ans = obj.array(a, b, n);
		            for(int i: ans)
		                System.out.print(i + " ");
		            System.out.println();
		        }
		    }
		}

		// } Driver Code Ends



		class Complete
		{
		    public static ArrayList<Integer> array(int a[][], int b[], int n)
		    {
		        ArrayList<Integer> ans=new ArrayList<Integer>();
		        int max=b[0];
		        int sum=0;
		        for(int i=0;i<a.length;i++){
		            for(int j=0;j<a.length;j++){
		                if(i==j){
		                   sum=sum+a[i][j]; 
		                }
		    
		            }
		            if(b[i]>max)
		            max=b[i];
		        }
		        ans.add(sum);
		        ans.add(max);
		        return ans;
		    }
		}



