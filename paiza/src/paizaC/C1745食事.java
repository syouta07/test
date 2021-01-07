package paizaC;

import java.util.Scanner;

public class C1745食事 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//食べ物
		int M = sc.nextInt();
		int [] MNo = new int [M];

		//人数
		int N = sc.nextInt();
		int [] NNo = new int [N];

		//食べ物のカロリーを配列に代入
		for(int i=0; i<M; i++) {
			MNo[i]= sc.nextInt();
		}

		//食べ物のカロリーとグラム数を計算して一人ずつの合計値をNNoの配列に代入
		//人数分計算するため配列を回す
		for(int i=0; i<N; i++) {

			//食べ物の数だけ配列を回す
			for(int j=0; j<M; j++) {

				//カロリーとグラム数を計算して代入
				NNo[i]+=(MNo[j]*sc.nextInt())/100;

			}
		}

		//計算した一人当たりのカロリーを表示
		for(@SuppressWarnings("unused") int ans: NNo) {
			System.out.println(NNo);
		}
		sc.close();
	}

}
