/*The Pan Am 73 flight from Bombay to New York en route Karachi and Frankfurt was hijacked by a few Palestinian terrorists at the Karachi International Airport.



Despite the alarming situation prevailing inside the flight, the senior flight purser Neerja Banhot had to wither her fear and rise to the occasion to take extra care of her passengers on board.



Firstly, she and her crew decided to provide food and drinks to the passengers. Given n the number of rows of seats in the aircraft and the total number of people in each row, can you determine the total number of passengers in the flight.

Input format
The first line of input consists of an integer n, corresponding to the number of rows in the aircraft.

Next line consists of the number of people in each row separated by a space.

Output format
The first line of output consists of n integers corresponding to the number of people in each row.

The second line of output consists of an integer corresponding to the total number of people in the aircraft.

Print Invalid Input and terminate the process of getting inputs if any of the inputs is not a positive number.

Refer sample input and output for further specifications.

Sample testcases
Input 1
5
12 28 30 20 45
Output 1
12 28 30 20 45 
135
Input 2
-6
Output 2
Invalid Input
Input 3
5
1 2 -3
Output 3
Invalid Input
*/
package placement;

import java.util.Scanner;

public class Refreshment {
	public static void main(String[] args)
	{
		int i,n,sum=0,count=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input");
		}
		else {
			int a[] = new int[n];
			for(i=0;i<n;i++) {
				a[i] = sc.nextInt();
				if(a[i] <0) {
					System.out.println("Invalid Input");
					break;
				}
				else {
					count++;
					sum = sum+a[i];
				}
			}
			if(count == n) {
			for(i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println(sum);
			sc.close();
			}
		}
	}

}
