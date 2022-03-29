
package placement;
import java.util.*;

public class Charity_Dinner {

	public static void main(String [] args) {
		int p,g,r,o,t,i,j,k,l,min=10000,c=0,x;
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		g = sc.nextInt();
		r = sc.nextInt();
		o = sc.nextInt();
		t = sc.nextInt();
	    for(i=0;i<=t;i++)
	    {
	        for(j=0;j<=t;j++)
	        {
	            for(k=0;k<=t;k++)
	            {
	                for(l=0;l<=t;l++)
	                {
	                    if(((p*i)+(g*j)+(r*k)+(o*l))==t)
	                    {
	                        System.out.println("# of PINK is "+i+" # of GREEN is "+j+" # of RED is "+k+" # of ORANGE is "+l);
	                        c++;
	                        x=i+j+k+l;
	                        if(min>x)
	                        {
	                            min=x;
	                        }
	                    }
	                }
	            }
	        }
	    }
	    System.out.println("Total combinations is "+c);
	    System.out.println("Minimum number of tickets to print is "+min);

	}
}
