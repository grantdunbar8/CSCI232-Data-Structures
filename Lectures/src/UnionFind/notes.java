package UnionFind;

public class notes {
	/*
	 * Union Find Data Structure
	 * --------------------------
	 * Building block for more complicated algorithms
	 * 		maintain a collection of disjoint sets. 
	 * 
	 * 			beginning data
	 * 				{1} {2} {3,4} {5}
	 * 			after union(1,5) runs
	 *  			{1,5} {2} {3,4}
	 *  		after find(2) runs
	 *  			return 2
	 *  		after fin(4) runs
	 *  			return 3
	 *  		
	 *  	union can be used to update data that is in the structure. 
	 *  
	 *  Dynamic-Connectivity Client uses union find. Examples of this is UF.java
	 *  
	 *  QuickFind(eager approach)
	 *  	-int array id[] of length N
	 *  	-Interpretation: id[p] is the id of the component containing p/
	 *  
	 *  QuickUnion(lazy approach)
	 *  	-int array id[] of length N
	 *  	Interpretation: id[i] is parent of i. This will be set up as a tree structure. Much Faster
	 *  
	 *   Path compression and union by rank can be used to make the algorithm faster 
	 *  
	 * 
	 */

}
