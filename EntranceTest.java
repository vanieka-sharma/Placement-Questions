package placement;
import java.util.*;

public class EntranceTest {
	static int numOfWays(int x,int n, int num)
    {
        int val = (int)(x- Math.pow(num,n));
        if(val == 0) return 1;
        if(val < 0) return 0;
        
        return numOfWays(val,n,num+1) +
                numOfWays(x,n,num+1);
    }
    static int countWays(int x, int n)
    {
        return numOfWays(x,n,1);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(countWays(x,n));
        sc.close();
    }

}
