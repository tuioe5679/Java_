package ch3;

import java.util.Arrays;
import java.util.Random;

public class RandomLotto {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[6];
		int tmp;
		int i=0;
		a : while(i<6) {
			tmp = r.nextInt(45)+1;
			for(int j=0;j<=i;j++) {
				if(tmp==num[j]) {
					continue a;//레이블 
				}
			}
			num[i] = tmp;
			i++;
		}
		System.out.println("이번 주 로또 당첨번호:"+Arrays.toString(num));
	}
}
