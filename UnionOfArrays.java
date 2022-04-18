package dsa_one;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
	static int union(int a[], int b[]) {
	Set<Integer> set = new HashSet<>();
	for(int x :a) {
		set.add(x);
	}
	for(int x: b) {
		set.add(x);
	}
	return set.size();
}
	public static void main(String[] args)
	{
		int a[] = {5,10,15,5};
		int b[] = {10,15,4,5};
		System.out.println(union(a,b));
	}

}
