// Find largest amplitude in binary tree.


package Assessment;

public class Solution {
	 
	  static int prev;
	  static int ampli = 0;
	  
	  public static class Node {
	 
	    public int value;
	 
	    public Node left;
	 
	    public Node right;
	 
	    public Node(int value){
	    	
	    	this.value=value;
	    	this.left=null;
	    	this.right=null;
	    }
	    
	    
	  }
	 
	  public static int solutn( Node root ) {
		  
		int result;
		int path[] = new int[1000];
		  
			  
	    result = pathampl(root, path, 0 );
			  
		 
		  
		  return result;
	 
	  }
	  
	  public static int pathampl(Node root, int path[], int pathLen ){
		 
		  	
		    if (root==null) return 0;
		   
		    
		    path[pathLen] = root.value;
		    pathLen++;
		   
		   
		    if (root.left==null && root.right==null) 
		    {
		      int res = ampl(path,pathLen);
		      
		      if (ampli < res)
		    	  ampli = res;
		      
		    }
		    else
		    {
		    
		    	pathampl(root.left, path, pathLen);
		    	pathampl(root.right, path, pathLen);
		    }
		    
		    return ampli;
	  }
	  
	  public static int ampl(int path[], int pathLen){
		  
		  int min=path[0]; 
		  int max=path[0]; 
		  int diff=0; 

		  
		  if(pathLen==0) 
		  return 0; 

		  if(pathLen>1000000) 
		  { 
		  return 0; 
		  } 
		  else 
		  { 

		  for(int i=1;i<pathLen; i++) { 
		  if(path[i]< min)
			min =path[i]; 
		  if(path[i]>max) 
		  max=path[i]; 

		  } 
		  diff=max-min;
		  } 
		  return diff;
		  
		  
	  }
	 
	  public static void main(String[] argv){
		  
		//  System.out.println("Hello World");
		  
		  Node root1 = new Node(5);
		  root1.left = new Node(8);
		  root1.right = new Node(9);
		  root1.left.left = new Node(12);
		  root1.left.right = new Node(2);
		  root1.right.left = new Node(8);
		  root1.right.right = new Node(4);
		  root1.right.left.left = new Node(2);
		  root1.right.right.right = new Node(5);
		  
		 
		  
		  Solution obj = new Solution();
		  
		  System.out.println(obj.solutn(root1));
		  
		  
		  
		  
	  }
	  
	}


