package placement;
//Write a program to find the sum of N natural numbers in a given range.

import java.util.*;
public class SumOfNnumber {
	public static int sumN(int n){
		int sum = n*(n+1)/2;
		return sum;
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int sum = sumN(r) - sumN(l-1);
		System.out.println(sum);
        sc.close();
		
	}

}
