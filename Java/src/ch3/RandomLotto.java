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
					continue a;//���̺� 
				}
			}
			num[i] = tmp;
			i++;
		}
		System.out.println("�̹� �� �ζ� ��÷��ȣ:"+Arrays.toString(num));
	}
}
