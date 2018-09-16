package begginers_selection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shift_only {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String binaryString;

		//格納用リスト
		ArrayList<Integer> list = new ArrayList<Integer>();

		//要素の個数（数字N）の取得
		int numberN = sc.nextInt();

		//値の格納
		for(int count = 0; count < numberN; count++) {
			//2進数のStringに変換
			binaryString = Integer.toBinaryString(sc.nextInt());

			//後方から何番目に"1"が来るか計算し、結果を格納
			StringBuffer sb = new StringBuffer(binaryString);
			String reversedBinary = sb.reverse().toString();
			list.add(reversedBinary.indexOf("1"));
		}
		System.out.println(Collections.min(list));
	}

}
