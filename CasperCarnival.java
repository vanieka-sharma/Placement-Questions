package placement;
import java.util.*;

public class CasperCarnival {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s;
        String arr[] = new String[n];
        if(n>1){
            s=0;
        }
        else{
            s=1;
        }
    
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        
            if(i >0)
            {
                if(arr[i-1].equals("cookie") && !(arr[i].equals("juice")))
                {
                    s=1;
                }
                if(i == n-1){
                    if(arr[n-1].equals("coockie")){
                        s=1;
                    }
                }
            }
        }
        if(s == 1){
        System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        sc.close();
    }


}
