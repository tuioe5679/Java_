package ch4;

import java.util.LinkedList;
import java.util.TreeSet;

public class Tree_MathSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> low = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
	
		for(int i=4;i>=0;i--) {
			low.add(i);
			even.add(i*2);
		}
		
		System.out.println(low);
		System.out.println(even);
		
		TreeSet<Integer> union = new TreeSet<Integer>(low);
		LinkedList<Integer> union1 = new LinkedList<Integer>(low);
		TreeSet<Integer> inter = new TreeSet<Integer>(low);
		TreeSet<Integer> diff = new TreeSet<Integer>(low);
		
		//합집합
		union.addAll(even);
		union1.addAll(even);
		//교집합
		inter.retainAll(low);
		//차집합
		diff.removeAll(even);
		
		System.out.println("odd와 even의 합집합" + union);
		System.out.println("(LinkedList)");
		System.out.println("odd와 even의 합집합" + union1 + "\n");
		System.out.println("odd와 even의 교집합" + inter);
		System.out.println("odd와 even의 차집합" + diff);
	}

}
