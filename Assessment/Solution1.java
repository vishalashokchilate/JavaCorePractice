// Find word present in given dictionary


package Assessment;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution1 {
	static char[][] data;
	static int row, col;
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	public static void main(String[] argv) throws IOException 
	{
		
	
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String input;
		
			int linenum=1;
			int r=0;
			while((input=br.readLine())!=null){ 
				 if(linenum==1)
					 row = Integer.parseInt(input);
				 if(linenum==2){
					 col = Integer.parseInt(input);
				 	 data = new char[row][col];
				 }
				 if(linenum>2 && linenum<=row+2){
					 int i=0;
					for(char c: input.toCharArray()){
					if(r<row && i<col)
						data[r][i]= c;
					i++;
				 }
					r++;
				 }
				 if(linenum>row+3){
					 map.put(input,1);
					
				 }
				 
				 linenum++;
				}
		}catch(IOException io){ 
			io.printStackTrace(); 
			}
		
		char[] colData = new char[row];
		for(int m=0; m<col; m++){
		for(int k=0; k<row; k++)
			colData[k] = data[k][m];
		combination(colData,0,row-1,row);
		
		}
		
	}
	
	public static void swap(char[] s, int i, int j){
		char temp;
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		
		
	}
	
	public static void combination(char[] s, int i, int n, int len){
		
		int j;
		String res="";
		boolean flag = false;
		boolean flag1 = true;
		if(i == n || len <=1){
			for(j=0; j<row; j++)
				res = res+s[j];
			String[] word = res.split(" ");
			for(String str : word){
				if(map.containsKey(str))
					flag=true;
				else{
					flag=false;
					flag1 = false;
				}
			}
			if(flag&&flag1){
				System.out.println(res);
				return;
			}
			
		}
		else
		{
			for(j=i; j<s.length; j++){
				
				swap(s,i,j);
				combination(s,i+1,n,len-1);
				swap(s,i,j);
				
				
			}
			
			
		}
		
	}

}
