package Assessment;
import java.util.*;
import java.lang.*;

public class test1 {
	
	public static void main(String[] argv){
		
		int[][] a = new int[][]{
				  { 977,109,8,9},
				  { 15,1299,105,101 },
				  { 18,20,71,81},
				  { 99,93,4,123}
		};
		
		path(a);
		
	 String s1 = "vishal";
	 String s2 = "vishael";
	 char[] con = s1.toCharArray();
	 Arrays.sort(con);
	 System.out.println(s1.compareTo(s2));
				
				
	}
	
	
	public static int path(int[][] a){
		
	
		
		
		int m=3, n=3,i=0,j=0;
		int min = a[0][0];
		
		while(true){
			System.out.println("i, j, min value of a[i][j] "+ i + "  "+ 	j + "   " +	min + " a[i]j] == " + a[i][j]);
			
			  if(i!=m && j!=n)
		       {
		           if(a[i+1][j] >= a[i][j+1])
		           {
		               i++;
		               if(min > a[i][j])
		               {
		                   min = a[i][j];
		               }
		               
		           }
		           else if(a[i+1][j] < a[i][j+1])
		           {
		               j++;
		               if(min > a[i][j])
		               {
		                   min = a[i][j];
		               }
		           }
		       }
		       else if(i==m && j!=n)
		       {
		            j++;
		            if(min > a[i][j])
		            {
		                min = a[i][j];
		            }
		               
		       }
		        else if(i!=m && j==n)
		       {
		            i++;
		            if(min > a[i][j])
		            {
		                min = a[i][j];
		            }
		               
		       }
		        else if(i==m && j==n)
		       {
		            break;
		               
		       }
			  
			  
		   }
	System.out.println("minimun value in path is " + min);	
	
	return min;
	
	}
		
	}
	


