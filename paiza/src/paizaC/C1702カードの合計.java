package paizaC;

import java.util.Arrays;
import java.util.Scanner;

public class C1702カードの合計 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//N = 人数
		int N = sc.nextInt();
		String [] count = new String [N];

		int zero=0;
		int kakeru=0;

		//数字を文字列に入れる
		for(int i=0; i<N; i++) {
			count[i] = sc.next();
		}


		//文字列の中に0とx10があるか調べる
		for(int i=0; i<N; i++) {

			//0があったらインクリメント
			if(count[i].equals("0")) {
				zero++;
			}
			//x10があったらデクリメント
			if(count[i].equals("x10")) {
				kakeru++;
			}
		}

		//0==0,x10==0
		if(zero==0 && kakeru==0) {
			ans1(count,N);
		//0==1 x10==0
		}else if(zero==1 && kakeru==0) {
			zero(count,N);
		//0==1 x10==0
		}else if(zero==0 && kakeru==1) {
			ans10(count,N);
		//0==1 x10==1
		}else {
			ans(count,N);
		}
		sc.close();
	}

	//** 以下のメソッドの共通点文字列から数列に変換し計算 **//

	//0==1 x10==1	最大値を計算せずに x10を計算するために0に変換する
	public static void ans(String[] count,int N) {
		int ans=0;
		int [] no = new int[N];

		//計算しやすいようにx10に0を代入する
		for(int i=0; i<N; i++) {
			if(count[i].equals("x10")) {
				count[i]="0";
			}

			//文字列を数字に変換する
			no[i] = Integer.parseInt(count[i]);
		}

		//大きい数を順番に並べる
		Arrays.sort(no);

		//0があるので最大の数を計算しない
		for(int i=0; i<N-1; i++) {
			ans += no[i];
		}
		//答え
		System.out.println(ans*10);
	}



	//0==0,x10==0	0も"x10"もないので普通に足し算する
	public static void ans1(String[] count,int N) {
		int ans=0;
		int [] no = new int[N];

		//文字列を数列に変換
		for(int i=0; i<N; i++) {
			no[i] = Integer.parseInt(count[i]);
		}
		//数列を計算
		for(int i=0; i<N; i++) {
			ans += no[i];
		}
		System.out.println(ans);
	}


	//0==0 x10==1
	public static void ans10(String[] count,int N) {
		int ans=0;
		int [] no = new int[N];

		for(int i=0; i<N; i++) {

			//x10を0に変換
			if(count[i].equals("x10")) {
				count[i]="0";
			}
			//数列に変換
			no[i] = Integer.parseInt(count[i]);
		}
		//計算
		for(int i=0; i<N; i++) {
			ans += no[i];
		}
		System.out.println(ans*10);
	}

	//0==1 x10==0
	public static void zero(String[] count,int N) {
		int ans=0;
		int [] no = new int[N];
		//数値に変換
		for(int i=0; i<N; i++) {
			no[i] = Integer.parseInt(count[i]);
		}

		//大きい順に並べる
		Arrays.sort(no);

		//0==1なので最大値の計算をしない
		for(int i=0; i<N-1; i++) {
			ans += no[i];
		}

		System.out.println(ans);
	}

}
