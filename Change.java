/* Pranav, an enthusiastic kid visited the "Fun Fair 2017" along with his family. His father wanted him to purchase entry tickets from the counter for his family members. Being a little kid, he is just learning to understand about units of money. Pranav has paid some amount of money for the tickets but he wants your help to give him back the change of Rs. N using minimum number of rupee notes. 

Consider a currency system in which there are notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100. If the change given to Pranav Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N.



Input format
First line of the input is an integer N, the change to be given to Pranav.

Output format
Output should display the the smallest number of notes that will combine to give N.

Sample testcases
Input 1
1200
Output 1
12
Input 2
242
Output 2
7*/

package placement;
import java.util.Scanner;

public class Change {
	public static void main(String [] args) {
		
		        int one = 0,two=0, five = 0, ten=0, fifty=0, hundred=0;
		        Scanner sc = new Scanner(System.in);
		        int x = sc.nextInt();
		        if(x>=100){
		            hundred = x/100;
		            x = x%100;
		        }
		        if(x>=50){
		            fifty = x/50;
		            x = x%50;
		        }
		        if(x>=10){
		            ten = x/10;
		            x = x%10;
		        }
		        if(x>=5){
		            five = x/5;
		            x = x%5;
		        }
		        if(x>=2){
		            two = x/2;
		            x = x%2;
		        }
		        if(x>=1){
		            one = x;
		        }
		        System.out.println(one+two+five+ten+fifty+hundred);
		    }
		
	}


