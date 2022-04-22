package placement;

import java.util.Scanner;

public class SalsaPairs {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int res;
        sc.close();
        int pairs=0;
        for(int i =0; i<=7;i++)
        {
            res = (int)(a.charAt(i)) ^ (int)(b.charAt(i));
        
        if(res == 1)
        {
            pairs = pairs+1;
        }
        }
        int percentage = (pairs*100)/8;
        
        System.out.println(percentage);
    }

}
