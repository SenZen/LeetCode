package course_schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 
 * 207. Course Schedule
 * 
 There are a total of n courses you have to take, labeled from 0 to n - 1.

 Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 */
public class CanFinish {
	// loop detection DFS(Depth first Search)

	 public static boolean canFinish(int numCourses, int[][] prerequisites) {
		 
		 // use adjacent matrix and a array to present a graph
		 int[][] matrix = new int[numCourses][numCourses];
		 int[] indegree = new int[numCourses];
		 
		 
		 int count = 0;
		 
		 
		 // Initialise a graph
		 for (int i = 0; i < prerequisites.length; i++) {
			 
			 // elinminate paralell edges 
			if (matrix[prerequisites[i][0]][prerequisites[i][1]] == 0) indegree[prerequisites[i][1]]++;
			
			matrix[prerequisites[i][0]][prerequisites[i][1]] = 1;
				
		}
		 
		 
		 
//		 // BFS getNextNeighbour if there is not a indgree == 0 and outdgree != 0, there is a loop 
		 // Only one loop, need a queue here!
//		 
//		 for (int i = 0; i < numCourses; i++) {
//			if (indegree[i] == 0 && outdegree[i] > 0) {
//				for (int j = 0; j < numCourses; j++) {
//					if (matrix[i][j] == 1) {
//						indegree[j]--;
//					}
//				}
//			}
//			
//		}
//		 
//		for (int i = 0; i < numCourses; i++) {
//			if (indegree[i] == 0) {
//				count++;
//				}
//		}
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0)
				queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			int course = queue.poll();
			count++;
			
			for (int i = 0; i < numCourses; i++) {
				if (matrix[course][i] != 0) {
					if (--indegree[i] == 0) {
						queue.offer(i);
					}
				}
			}
		}
		 
		return count == numCourses;
		 
	 }

	 
	 
	 
		/* Leetcode discussion*/
//	  public static boolean canFinish(int numCourses, int[][] prerequisites) {
//		    int[][] matrix = new int[numCourses][numCourses]; // i -> j
//		    int[] indegree = new int[numCourses];
//
//		    for (int i=0; i<prerequisites.length; i++) {
//		        int ready = prerequisites[i][0];
//		        int pre = prerequisites[i][1];
//		        if (matrix[pre][ready] == 0)
//		            indegree[ready]++; //duplicate case
//		        matrix[pre][ready] = 1;
//		    }
//		    
//		    int count = 0;
//		    Queue<Integer> queue = new LinkedList<Integer>();
//		    for (int i=0; i<indegree.length; i++) {
//		        if (indegree[i] == 0) queue.offer(i);
//		    }
//		    
//		    while (!queue.isEmpty()) {
//		    	int course = queue.poll();
//		    	count++;
//		    	
//		    for (int i=0; i<numCourses; i++) {
//		    	if (matrix[course][i] != 0) {
//		    		if (--indegree[i] == 0)
//		    			queue.offer(i);
//		             }
//		         }
//		    }
//		    return count == numCourses;
// }

/*
* My answer -- too slow*/
//ArrayList<Integer> temp = new ArrayList<Integer>();
//	  	
//	  	for (int i = 0; i < prerequisites.length; i++) {
//	  		temp.add(prerequisites[i][0]);
//	  		temp.add(prerequisites[i][1]);
//	  		
//	  		for (int j = 0; j < prerequisites.length; j++){
//	  			if (temp.get(temp.size() - 1) == prerequisites[j][0]) {
//	  				temp.add(prerequisites[j][1]);
//	  				}
//		  		}
//	  		while(temp.remove(null));
//	  		if (!checkDuplicate(temp)) {
//	  			return false;
//	  		}
//	  	temp.clear();
//	  	}
//		
//       return true;
//   }
// 
//	static boolean checkDuplicate(ArrayList<Integer> list) {
//		 
// 		 HashSet<Integer> set = new HashSet<Integer>();
// 		 for (int i = 0; i < list.size(); i++) {
// 			 boolean val = set.add(list.get(i));
// 			 if (val == false) {
// 				 return val;
// 			 }
// 		 }
// 		 return true;
// 		}

	
}
	  
