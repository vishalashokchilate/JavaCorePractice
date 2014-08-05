package Assessment;
import java.util.Map.Entry;
import java.util.*;

import Assessment.Node;

public class IntersectionList {

public static void main(String[] argv){
		
		System.out.println("Hello World");
		Node head1 = new Node(4,null);
		Node head2 = new Node(1,null);
		head1.next = new Node(2,null);
		head1.next.next = new Node(73,null);
		head1.next.next.next = new Node(11,null);
		head1.next.next.next.next = new Node(-5,null);
		head1.next.next.next.next.next = new Node(73,null);
		/*head1.insert(head1,2);
		head1.insert(head1,73);
		head1.insert(head1,11);
		head1.insert(head1,-5);
		head1.insert(head1,73); */
		head2.insert(head2,-5);
		head2.insert(head2,73);
		head2.insert(head2,1);
		head2.insert(head2,2);
		head2.insert(head2,9);
		head2.insert(head2,4);
		head2.insert(head2,73);
		head2.insert(head2,7);
		head2.insert(head2,73);
		System.out.println("First List");
		head1.print(head1);
		System.out.println("Second List");
		head2.print(head2);
		
		//IntersectionList obj = new IntersectionList();
		Node intersect = intersection(head1, head2);
		System.out.println("Intersection List");
		intersect.print(intersect);
		
	}
	
	public static Node intersection(Node head1, Node head2) {

		// your code goes here
	
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		TreeSet<Integer> Iset = new TreeSet<Integer>();
		Node head3 = new Node();
		Node temp = head3;
		
		
		while(head1!=null){
			
			map.put(head1.value, 0);
			head1=head1.next;
		}
		
		while(head2!=null){
			if (map.containsKey(head2.value))
				map.put(head2.value, map.get(head2.value) + 1);
				
			    head2=head2.next;
		}
		
		Collection c = map.values();
				
		Iterator<Integer> it = c.iterator();
		
		/*while(it.hasNext()){
			if (map.get(it.next())>0){
			head3.next = new Node(it.next(),null);
			head3=head3.next;
			}
		}
		*/
		
		for (Entry<Integer, Integer> entry : map.entrySet() ){
			
			if (entry.getValue()>0){
				head3.next = new Node(entry.getKey(),null);
				head3=head3.next;
				}
				
			}

		return temp.next;
		
		}
}




