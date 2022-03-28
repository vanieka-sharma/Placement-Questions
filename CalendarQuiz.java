package placement;
import java.util.Scanner;

public class CalendarQuiz {
	
	public static void main(String [] args) {
		int year, d,c,f =0;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
	    year=year-1;
	    sc.close();
	    d=year%100;
	    c=year/100;
	    f=d/4;
	    f=f+d;
	    f=f+(c/4);
	    f=f-(2*c);
	    f=f+29;
	    f=f%7;
	    if(f<0)
	    {
	        f=f+7;
	    }
	    switch(f)
	    {
	        case 0:System.out.println("Sunday");break;
	        case 1:System.out.println("Monday");break;
	        case 2:System.out.println("Tueday");break;
	        case 3:System.out.println("Wednesday");break;
	        case 4:System.out.println("Thursday");break;
	        case 5:System.out.println("Friday");break;
	        case 6:System.out.println("Saturday");break;
	    }

	}

}
