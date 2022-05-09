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
