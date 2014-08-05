/*Approach: put all the elements into HashMap from one list say 'List a' elements as key and 0 as value 
 * for all elements. Traverse second list 'List b' and while traversing check if every elements contains in 
 * HashMap, if it is there, it means it is intersection element so increment its value field of HashMap by one
 * Finally, iterate through HashMap and check for all the key which has value>0 and add that key to another list
 * return final List.
 * I have used HashMap data structure because its add and search is O(1) Time.
 * 
 * Complexity: Time: to put all elements from one list in HashMap O(n) + to check if all elements of second list are there
 *                   in HashMap O(m) + iterate through HashMap O(n) where n=size of list1, m=size of list2
 *                   hence total = O(n).
 *             Space: O(n) extra space for HashMap;
 */



package Assessment;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;

public class IntersectionQue {

	public static List<Integer> intersection (List<Integer> a, List<Integer> b) {
	
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		List myList = new ArrayList();  
	    
		for(int i=0; i<a.size(); i++){
			
			map.put(a.get(i), 0);
		}
		
        for(int i=0; i<b.size(); i++){
			if(map.containsKey(b.get(i)))
			map.put(b.get(i), map.get(b.get(i))+1);
		}
        
        for (Entry<Integer, Integer> entry : map.entrySet() ){
			
			if (entry.getValue()>0)
				myList.add(entry.getKey());
				
				
			}

        return myList;
    }
	
	public static void main(String[] argv){
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		
		a.add(4);
		a.add(2);
		a.add(73);
		a.add(11);
		a.add(-5);
		b.add(-5);
		b.add(73);
		b.add(-1);
		b.add(9);
		b.add(9);
		b.add(4);
		b.add(7);
		
		c = intersection(a,b);
		System.out.println(c);
		
	}
	
}

/*Approach: put all the elements into HashMap from one list say 'List a' elements as key and 0 as value 
 * for all elements. Traverse second list 'List b' and while traversing check if every elements contains in 
 * HashMap, if it is there, it means it is intersection element so increment its value field of HashMap by one
 * Finally, iterate through HashMap and check for all the key which has value>0 and add that key to another list
 * return final List.
 * I have used HashMap data structure because its add and search is O(1) Time.
 * 
 * Complexity: Time: to put all elements from one list in HashMap O(n) + to check if all elements of second list are there
 *                   in HashMap O(m) + iterate through HashMap O(n) where n=size of list1, m=size of list2
 *                   hence total = O(n).
 *             Space: O(n) extra space for HashMap;
 */

