package ch3;

import java.util.LinkedList;

public class QueueTest1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		System.out.println(queue.offer("��⵵"));
		System.out.println(queue.offer("��û��"));
		System.out.println(queue.offer("����"));
		System.out.println(queue.offer("������"));
		System.out.println(queue.offer("���"));
		while(!queue.isEmpty()) {
			String s = queue.poll();
			System.out.println(s);
		}
	}
}
