package placement;
/*Raju has a l-length hot dog that he wants to chop in an efficient manner so that he can share it with as many friends as possible to retain his frinship. Based on the chopped length product the maximum served friends are calculated.

Example

Input

4

Output

Maximum friends served 4

Explanation

If hot dog chopped into 1, 1, 1, 1   (1 × 1 × 1 × 1) = 1 here he can retain only 1 friend.

If hot dog chopped into 2,2   (2*2) = 4 here he can retain only 4 friends.

If hot dog chopped into 3,1   (3*1) = 3 here he can retain only 3 friends. Similarly, try all possibilities to keep as many friends as possible by sharing a hot dog.

Input format
First integer corresponds to l-length hot dog*/

import java.util.*;
public class MaxProfit {
	
	public static int findMaxProfit(int n)
    {
        if (n <= 1) {
            return n;
        }
        int maxValue = n;
        for (int i = 1; i <= n; i++) {
            maxValue = Integer.max(maxValue, i * findMaxProfit(n - i));
        }
        return maxValue;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Maximum friends served " + findMaxProfit(n));
        s.close();
    }

}
