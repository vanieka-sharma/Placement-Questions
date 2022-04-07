package dsa_one;

public class RainwaterTrapping {
	
	public static int rainWater(int[] height)
	{
		int left=0,right=height.length - 1;
		int water = 0;
		int maxLeft = height[left];
		int maxRight = height[right];
		
		while(left<right)
		{
			if(height[left] <= height[right])
			{
				left++;
				maxLeft=Integer.max(maxLeft,height[left]);
				water += (maxLeft-height[left]);
			}
			else {
				right--;
				maxRight=Integer.max(maxRight,height[right]);
				water += (maxRight-height[right]);
			}
		}
		return water;
	}

	public static void main(String[] args) {
		int a[] = {3,1,2,4,0,1,3,2};
		System.out.println(rainWater(a));

	}

}
