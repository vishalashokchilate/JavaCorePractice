//Approach: I have used HashMap to store all n points as key and square of distance as value. I think no need to calculate squareroot
// as square of distance for closest point will minimum then sorted this HashMap by value using comparable.
// pass first k points from sorted map to other point array and return it
//Complexity: Time:- O(nlog(n)), putting points and square of distances into Hashmap is O(n), where n=no. of points + to sort this map


package Assessment;
import java.util.*;


public class OriginQuestion {

	public static class Point {


	    public double x;


	    public double y;

	    
	  } 
	  
	  public static Point[] closestk( Point  myList[], int n, int k ) {
		  
		  HashMap<Point,Double> map = new HashMap<Point,Double>();
		  Point[] kpoint = new Point[k];
		  double dist;
		  for(int i=0; i<n; i++){
			  dist = myList[i].x*myList[i].x + myList[i].y*myList[i].y;
			  map.put(myList[i], dist);
			}
		  		  		  
		  TreeMap<Point,Double> map1 = sortByValues(map);
		  		  		  
		  for(int i=0; i<k; i++){
			  kpoint[i] = new Point();
			  kpoint[i] = map1.firstKey();
			  map1.pollFirstEntry();
			  // map1.remove(kpoint[i]);
		  }

		  		  		  
		  return kpoint;
		  
	  }
	  
	  public static <Point, Double extends Comparable<Double>> TreeMap<Point, Double> sortByValues(final Map<Point, Double> map) {
		    Comparator<Point> valueComparator =  new Comparator<Point>() {
		        public int compare(Point p1, Point p2) {
		            int compare = map.get(p1).compareTo(map.get(p2));
		            if (compare == 0) return 1;
		            else return compare;
		        }
		    };
		    TreeMap<Point, Double> sortedByValues = new TreeMap<Point, Double>(valueComparator);
		    sortedByValues.putAll(map);
		    return sortedByValues;
		}

	
	
	  public static void main(String[] argv){
		  System.out.println("Hello World");
		  Point[] myList = new Point[5];
		  //List<Integer> l1 = new ArrayList<Integer>();
		  
		  for(int i=0;i<5;i++){
			  myList[i]=new Point();
			  myList[i].x=i;
			  myList[i].y=i;
		  }

		  for(int j=0;j<5;j++){
			  System.out.println("point"+(j+1));
			  System.out.println(myList[j].x);
			  System.out.println(myList[j].y);
		  }
		  
		  Point[] mypoint = closestk(myList,5,3);
		  
		  System.out.println("Closest k point are");
		  for(int j=0;j<3;j++){
			  System.out.println("point"+(j+1));
			  System.out.println(mypoint[j].x);
			  System.out.println(mypoint[j].y);
		  }
		  
	  }

}


