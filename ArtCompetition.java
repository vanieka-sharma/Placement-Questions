package placement;
import java.util.*;

public class ArtCompetition {
	static void printNumbers(int n)
    {
        if(n == 1)
        {
            System.out.print(1+" "); 
        }
        if(n>1)
        {
            printNumbers(n-1);
            System.out.print(n+" ");
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }

}
