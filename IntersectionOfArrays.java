package dsa_one;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
	static int count;
	static int intersect(int a[], int b[])
	{
		Set<Integer> set = new HashSet<>();
		for(int x: a) {
			set.add(x);
		}
		for(int x: b) {
			if(set.contains(x)) {
				count++;
				set.remove(x);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a[] = {5,10,15,5,10};
		int b[] = {15,4,10};
		System.out.println(intersect(a,b));
	}

}
