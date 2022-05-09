package ch3;

import java.util.LinkedList;

public class QueueTest1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		System.out.println(queue.offer("경기도"));
		System.out.println(queue.offer("충청도"));
		System.out.println(queue.offer("전라도"));
		System.out.println(queue.offer("강원도"));
		System.out.println(queue.offer("경상도"));
		while(!queue.isEmpty()) {
			String s = queue.poll();
			System.out.println(s);
		}
	}
}
