package placement;

import java.util.Scanner;

public class Pirates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int coins = sc.nextInt();

		int ben = sc.nextInt();

		int black = sc.nextInt();
		
		sc.close();

		int benShare = (int)(ben * coins / 100);

		coins = coins - benShare;

		System.out.println(benShare);



		int blackShare = (int)(black * coins / 100);

		coins = coins - blackShare;

		System.out.println(blackShare);



		int others = coins/3;

		System.out.println(others);

	}

}
