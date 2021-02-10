package AlgorithmAnalysis;

public class notes {
	/*
	 * Running time of algorithms
	 * 
	 * Computational Geometry: Deals with algorithms that are related to geometric structures and making them efficient
	 * 	-Things like angry birds
	 * 
	 * Brute Force Algorithm:
	 */ 	public static int count(int[] a){
	  			int N = a.length;
	  			int count = 0;
	  			for(int i = 0; i < N; i++) {
	  				for(int j = i+1; j < N; j++) {
	  					for(int k = j+1; k < N; k++) { //check each triple, three nested for loops 
	  						if(a[i] + a[j] + a[k] == 0) {count++;} //for simplicity, ignore integer overflow
	  					}
	  				}
	  			}
	  			return count;
	 		}
	 
	 /* What is the time complexity of this algorithm?
	  * roughly n^3
	  *
	  *You can use a log-log plot to help figure out the time complexity. 
	  *
	  *What influences running time?
	  *	System Independent Effects:
	  *		-Algorithm
	  *		-Input Data -- these determine exponent in power law
	  *	System Dependent Effects:
	  *		-Hardware: CPU, memory, cache, ...
	  *		-Software: complier, interpreter, garbage collector, ...
	  *		-System: operating system, network, other apps, ...
	  *
	  *
	  *Mathematical Models for running time complexities:
	  *Often by studying the code, we can make some predictions about what the shape of the running time function will look like
	  *
	  *Big-O Notation
	  *	A way to describe the running time of the function without worrying about the constants
	  *		e.g.  T(n) =	O(N^2) 
	  *				   =	a*n^2 + (some constant)
	  *
	  *	Definition: A function f belongs to O(g) or f=O(g) iff there exists a constant c and another constant n, such that for every N>n
	  *		f(N) <= c*g(N)
	  *
	  *Each comparison's running time is O(1) time
	  *
	  */

}
