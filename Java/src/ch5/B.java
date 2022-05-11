package ch5;

import java.util.LinkedList;

public class B {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Object> queue = new LinkedList<>();
		for(int i=10;i>=0;i--) {
			queue.add(i);
		}
		for(int i=0;i<=10;i++) {
			System.out.println(queue.get(i));
			Thread.sleep(1000);
		}
	}
}
