package begginers_selection;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//整数の入力
		int numA = sc.nextInt();
		int numB = sc.nextInt();

		if(numA % 2 == 1){
			//numAが奇数の場合

			if(numB % 2 == 1) {
				//numBも奇数の場合
				System.out.println("Odd");
			}else {
				System.out.println("Even");
			}

		}else{
			System.out.println("Even");
		}
	}
}
