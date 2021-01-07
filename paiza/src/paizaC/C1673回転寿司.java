package paizaC;

import java.util.Scanner;

public class C1673回転寿司 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count=0;
		int melon=0;

		//流れてくるネタの数
		for(int i=1; i<=T; i++) {

			//ネタの流れた来る数をカウントする
			count++;

			//ネタの名前を受け取る
			String s = sc.next();

			//メロンが一つ目が流れてくるまでの処理
			if(melon==0) {

				//流れてくるネタがメロン
				if(s.equals("melon")) {

					//メロン++
					melon++;

					//カウントを0に代入
					count=0;
				}

				//メロンを1つ以上食べた時
			}else {
				if(s.equals("melon")&&count>10) {

					//メロンをカウント
					melon++;

					//ネタのカウント0
					count=0;
				}
			}
		}
		System.out.println(melon);
		sc.close();
	}

}
