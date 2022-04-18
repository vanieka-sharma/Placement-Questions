package dsa_one;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
	static int countDistinct(int a[])
	{
		Set<Integer> set = new HashSet<>();
		for(int element: a) {
			set.add(element);
		}
		return set.size();
	}
	public static void main(String[] args)
	{
		int a[] = {5,10,15,5,4,5};
		System.out.println(countDistinct(a));
	}

}
