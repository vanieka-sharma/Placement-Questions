package placement;
import java.util.*;

public class BestProgrammer {
	
	
	
	    public static int findType(int a)
	    {
	        int i,j=0;
	        for(i=1;i<=a/2;i++)
	        {
	            if(a%i==0)
	            {
	                j=j+i;
	            }
	        }
	        if(j==a) return 0;
	        else if(j>a) return -1;
	        else return 1;
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        if(findType(a)==0){
	            System.out.println(a+" is a perfect number");
	        }
	        else if(findType(a)==1) System.out.println(a+" is a deficient number");
	        else System.out.println(a+" is a abundant number");
	        sc.close();
	    }
	}

