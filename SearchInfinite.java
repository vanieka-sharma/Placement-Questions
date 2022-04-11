package dsa_one;
//find the element in an infinite sorted array.
public class SearchInfinite {
	
	static int binarySearch(int arr[], int l, int r, int x)
	{
		if(r>=l)
		{
			int mid = l+ (r-l)/2;
			if(arr[mid]== x) return mid;
			if(arr[mid]>x) return binarySearch(arr,l,mid-1,x);
			return binarySearch(arr, mid+1, r, x);
		}
		return -1;
	}
	
	static int findPos(int arr[], int key)
	{
		int low=0;
		int high = 1;
		while(arr[high]<key)
		{
			low = high;
			high = 2*high;
		}
		return binarySearch(arr, low, high, key);
	}

	public static void main(String[] args) {
		int arr[] = {1,3,7,8,12,58,72,100,130,145,178};
		int ans = findPos(arr,8);
		if(ans==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println(ans);
		}
	}

}
