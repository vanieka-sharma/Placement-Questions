package dsa_one;

public class BinarySearch {
	
	static int binarySearch(int a[], int key)
	{
		int low = 0, high=a.length - 1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(key>a[mid]){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {-4,-1,3,7,10,11};
		System.out.println(binarySearch(a,7));

	}

}
