/*The Event Organizing Company "Buzzcraft" focuses event management in a way that creates a win-win situation for all involved stakeholders. Buzzcraft don't look at building one time associations with clients, instead, aim at creating long-lasting collaborations that will span years to come. This goal of the company has helped them evolve and gain more clients within notable time.

The number of clients of the company from the start day of their journey till now is recorded sensibly and is seemed to have followed a specific series like: 2,3,5,7,11,13,17,19, 23 ... 

Write a program which takes an integer N as the input and will output the series till the Nth term.

Input format
First line of the input is an integer N.

Output format
Output a single line the series till Nth term, each separated by a comma.

Sample testcases
Input 1
5
Output 1
2 3 5 7 11 
Input 2
10
Output 2
2 3 5 7 11 13 17 19 23 29*/

package placement;
import java.util.*;

public class Series_1 {

	public static void main(String[] args) {
		int n,i,j,k=2,s=0;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	        for(j=2;j<=k/2;j++)
	        {
	            if(k%j==0) { 
	            	s=1;
	            	break;
	            	}
	        }
	        if(s==0) { 
	        	System.out.print(k+" ");
	        	}
	        else { 
	        	i--; 
	        	}
	        k++;s=0;
	    }


	}

}
