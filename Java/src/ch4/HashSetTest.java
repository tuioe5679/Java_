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
		System.out.println("7 �߰� ����?: "+setChanged);
		System.out.println("Ȧ�� set: "+odd);
		System.out.println("¦�� set: "+even);
		
		System.out.println("odd���� ����ū ����?: " + Collections.max(odd));
		System.out.println("even���� �������� ����?: " + Collections.min(even));
		
		Iterator<Integer> it = odd.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			sum += it.next();
		}
		
		System.out.println("odd set�� �� �հ�: " + sum);
	}

}
