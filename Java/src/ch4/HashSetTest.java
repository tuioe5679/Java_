package ch4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		for(int i=1;i<=5;i+=2) {
			odd.add(i);
			even.add(i+1);
		}
		
		boolean setChanged = odd.add(7);
		System.out.println("7 추가 성공?: "+setChanged);
		System.out.println("홀수 set: "+odd);
		System.out.println("짝수 set: "+even);
		
		System.out.println("odd에서 가장큰 값은?: " + Collections.max(odd));
		System.out.println("even에서 가장작은 값은?: " + Collections.min(even));
		
		Iterator<Integer> it = odd.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			sum += it.next();
		}
		
		System.out.println("odd set의 총 합계: " + sum);
	}

}
