package ch3;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompTest {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		long start,stop;
		
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			alist.add(i);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("ArrayList - ¼øÂ÷ »ðÀÔ: "+(stop-start));
		
		start =System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			llist.add(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("LinkedList - ¼øÂ÷Àû »ðÀÔ: "+(stop-start));
	}
}
