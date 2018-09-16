package begginers_selection;

import java.util.Scanner;

public class Placing_Marbles {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//文字列の入力
		String str = sc.nextLine();

		int sum = 0;

		for (int count = 0; count < 3; count ++) {
			sum += Character.getNumericValue(str.charAt(count));
		}
		System.out.println(sum);

	}

}
