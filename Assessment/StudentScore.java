// Approach: TestResult has three field, no need to consider test date for calculations. 
// I have created heap contains maximum scores for all students. priorityQueue data structure use for minimum heap but 
//by placing condition if size of heap>5 then remove min top node score. so eventually all heaps will store top five score
// of a student. I have used HashMap to store heap as value for all different students as key. I have used other HashMap
// student ID as key and average of max five score as value. 
//Complexity: Time:- to create heap of size 5 for all students it will take O(nlog5) which is upper bound for this quest 
//where n= no. of test results 
//

package Assessment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

class TestResult {
	int studentId;
	Date testDate;
	int testScore;

	TestResult(int ID, int Score) {
		studentId = ID;
		testScore = Score;
	}
}


public class StudentScore {
	


	public static Map<Integer, Double> calculateFinalScores(
			List<TestResult> results) {

		HashMap<Integer, PriorityQueue<Integer>> maxfive = new HashMap<>();

		for (TestResult entry : results) {
			PriorityQueue<Integer> maxheap = maxfive.get(entry.studentId);
			if (maxheap == null) {
				maxheap = new PriorityQueue<Integer>();
				maxfive.put(entry.studentId, maxheap);
			}
			maxheap.add(entry.testScore);
			if (maxheap.size() > 5) {
				maxheap.poll();
			}
		}

		Map<Integer, Double> finalScore = new HashMap<>();
		for (int id : maxfive.keySet()) {
			double total = 0.0;
			for (int studscore : maxfive.get(id)) {
				total= total+studscore;
			}
			finalScore.put(id, total / 5.0);
		}

		return finalScore;
	}

	public static void main(String[] args) {
		int[][] studscores = { { 110, 37 }, { 110, 78 }, { 110, 85 }, { 110, 95 },
				{ 110, 88 }, { 110, 77 }, { 110, 55 }, { 210, 86 }, { 210, 78 },
				{ 210, 97 }, { 210, 99 }, { 210, 91 }, { 210, 45 }, { 210, 83 } };

		List<TestResult> results = new ArrayList<>();
		for (int[] entry : studscores) {
			results.add(new TestResult(entry[0], entry[1]));
		}

		System.out.println(calculateFinalScores(results));

	}
}



