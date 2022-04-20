package dsa_one;

import java.util.HashMap;

public class SubarrayWIthGivenSum {
	static void SubArrayAum(int a[], int sum)
	{
		int curSum = 0;
		int start = 0;
		int end = -1;
		int n = a.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			curSum +=a[i];
			if(curSum-sum==0)
			{
				start=0;end=i;
				break;
			}
			if(map.containsKey(curSum-sum))
			{
				start=map.get(curSum-sum)+1;
				end=i;break;
			}
			map.put(curSum,i);
			
		}
		if(end==-1)
		{
			System.out.println("Not Found");
		}
		else {
			System.out.println(start+" "+end);
		}
	}
	public static void main(String[] args)
	{
		int a[] = {10,15,-5,15,-10,5};
		int sum = 5;
		SubArrayAum( a,  sum);
		
	}

}
