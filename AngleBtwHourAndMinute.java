package placement;
import java.util.Scanner;
/*hr hand:
12hrs = 360deg
1hr = 30 deg
60m = 30 deg
1m = 1/2 deg
 
min hand:
60 min = 360 deg
1min = 6 deg
 
time:7:30pm
Angle covered by hr hand - angle covered by min hand
7*30 + 30 *1/2 - 30*6
7*30 +30(1/2 - 6)
7*30 + 30(-11/2)
30*H - 11/2*M
Angle = 30H ~ 11/2 M
If H>M , 30H - 11/2 M
If M>H,11/2 M - 30 H*/

public class AngleBtwHourAndMinute {
	
	  public static void main(String args[])
	  {
	    Scanner sc = new Scanner(System.in);
	    float h = sc.nextFloat();
	    float m = sc.nextFloat();
	    if(0<h && h<=12 && 0<=m && m<60)
	    {
	      float angle = (float)((11.0/2.0)*m -(30.0*h));
	      angle=(angle<0)?angle+360:angle;
	      if(angle>180)
	        System.out.println(360 - angle);
	      else
	        System.out.println(angle);
	    }
	    else
	    System.out.print("Invalid Input");
	    sc.close();
	  }
}

