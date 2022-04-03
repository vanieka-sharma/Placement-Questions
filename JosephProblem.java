package placement;

public class JosephProblem {
	static int josephus(int n, int k) {
		if(n == 1) {
			return 1;
		}
		else
			// formula: previous position = relative position + offset; relative position = (n-1,k); offset = k-1
			// 
			return (josephus(n-1, k) + k - 1)% n+1;
	}

	public static void main(String[] args) {
		int n = 100;
		int k = 2; 
		System.out.println(josephus(n, k));
	}

}
