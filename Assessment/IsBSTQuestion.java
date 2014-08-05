/* Approach: Traverse the given tree in inorder fashion and check if it is increasingly sorted as property of 
			 binary search tree. If it is in increasing order mean it is binary search tree else it is not 
			 binary search tree. 
	Complexity: Time:- As it is visiting every node of tree once, therefore O(n) where n=no. of nodes
				Space:- As I have used recursive function it will take O(h) stack frames, where h= height of tree

*/


package Assessment;

public class IsBSTQuestion {
	 
	  static int prev;
	  
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
	 
	  public static boolean isBST( Node root ) {
		  
		  if(root!=null){
			  
			  isBST(root.left);
			  if(root.value<=prev)
				  return false;
			  prev = root.value;
			  isBST(root.right);
			  
		  }
		  
		  return true;
	 
	  }
	 
	  public static void main(String[] argv){
		  
		  System.out.println("Hello World");
		  
		  Node root1 = new Node(4);
		  root1.left = new Node(2);
		  root1.right = new Node(8);
		  root1.left.left = new Node(1);
		  root1.left.right = new Node(3);
		  
		  Node root2 = new Node(4);
		  root2.left = new Node(2);
		  root2.right = new Node(8);
		  root2.left.left = new Node(1);
		  root2.left.right = new Node(6);
		  
		  IsBSTQuestion obj = new IsBSTQuestion();
		  
		  
		  if(obj.isBST(root1))
			  System.out.println("Is BST");
		  else
			  System.out.println("Not BST");
/*****************************************************************************/
		  
		  if(obj.isBST(root2))
			  System.out.println("Is BST");
		  else
			  System.out.println("Not BST");
			
		  
	  }
	  
	}


/* Approach: Traverse the given tree in inorder fashion and check if it is increasingly sorted as property of 
			 binary search tree. If it is in increasing order mean it is binary search tree else it is not 
			 binary search tree. 
	Complexity: Time:- As it is visiting every node of tree once, therefore O(n) where n=no. of nodes
				Space:- As I have used recursive function it will take O(h) stack frames, where h= height of tree

*/