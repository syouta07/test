package paizaC;

import java.util.Scanner;

public class 未完成C1648スピード違反の取り締まり {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		System.out.println("N:"+N);
		int n2 = 0;

		int V = sc.nextInt();
		int count =0;

		int p = 0;

		for(int i=0; i<N; i++) {

			int t_1 = sc.nextInt();
			int p_1 = sc.nextInt();

			if(p_1>V && i==0) {
				count++;

			}else {
				if(p_1-p>t_1-n2*V) {
				    System.out.println((p_1-p)+">"+(n2*V-t_1));
					count++;
				}

			}

			n2 = t_1;
			System.out.println("n2:"+n2);
			p = p_1;
			System.out.println("p:"+p);
		}
		if(count>=1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
