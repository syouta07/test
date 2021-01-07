package paizaC;

import java.util.Scanner;

public class C1716座標 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int xMax=0;
		xMax=x;

		for(int i=0; i<T; i++) {
			int x_1 = sc.nextInt();
			int y_1 = sc.nextInt();
			if(y>=1){
			    x+=x_1;
			    y+=y_1;
			    if(xMax<=x){
			        xMax=x;
			    }
			}
		}
		System.out.println(xMax);
		sc.close();
	}

}
