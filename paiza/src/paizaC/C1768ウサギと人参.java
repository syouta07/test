package paizaC;

import java.util.ArrayList;
import java.util.Scanner;

public class C1768ウサギと人参 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int p = sc.nextInt();
		int count =0;
		int no=0;
		ArrayList<Integer> listM = new ArrayList<Integer>();
		ArrayList<Integer> listCount = new ArrayList<Integer>();

		for(int i=0; i<N; i++) {
			count++;
			//質量
			int m_1 =sc.nextInt();
			//糖分
			int s_1 =sc.nextInt();

			if(s_1<=S+p && s_1>=S-p) {
				listM.add(m_1);
				listCount.add(count);
				no++;
			}
		}
		if(no>=1) {
			Max(listM,listCount);
		}else {
			System.out.println("not found");
		}

		sc.close();
	}

	public static void Max(ArrayList<Integer> M,ArrayList<Integer> count) {
		int a =0;
		for(int i=0; i<M.size(); i++) {
			if(M.get(i)>=a) {
				a=M.get(i);
			}
		}

		for(int i=0; i<M.size(); i++) {
			if(a==M.get(i)) {
				System.out.println(count.get(i));
				break;
			}
		}
	}
}
