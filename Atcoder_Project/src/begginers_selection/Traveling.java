package begginers_selection;

import java.util.Scanner;

public class Traveling {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int savedTime = 0;
		int savedCursorX = 0;
		int savedCursorY = 0;
		boolean result = true;


		//経由地点数を読み込み
		int numPoint = sc.nextInt();

		for(int point = 0; point < numPoint; point++) {
			//読み込み
			int time = sc.nextInt();
			int CursorX = sc.nextInt();
			int CursorY = sc.nextInt();

			//距離を求める
			int timeLag = Math.abs(time - savedTime);
			int distance = Math.abs(CursorX - savedCursorX) + Math.abs(CursorY - savedCursorY);

			if(timeLag >= distance) {
				if((timeLag % 2) != (distance % 2)) {
					result = false;
					break;
				}
			}else {
				result = false;
				break;
			}

			savedTime = time;
			savedCursorX = CursorX;
			savedCursorY = CursorY;
		}

		if(result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
