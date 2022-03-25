package placement;

import java.text.DecimalFormat;
import java.util.*;

public class Gainpercent {
	public static void main(String [] args) {
		int price,repair,sp,cp,gain;
		double gainpercent;
		DecimalFormat d = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		price = sc.nextInt();
		repair = sc.nextInt();
		sp = sc.nextInt();
		cp = price+repair;
		gain = sp-cp;
		gainpercent = ((double)gain/(double)cp) *100;
		System.out.println(d.format(gainpercent));
		sc.close();
	}

}
