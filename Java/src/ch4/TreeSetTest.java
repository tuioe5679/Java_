package ch4;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> odd = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		
		for(int i=4;i>=0;i--) {
			odd.add(i);
			even.add(i*2);
		}
		
		boolean setChanged = odd.add(5);
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
