package ch5;

import java.util.LinkedList;

public class B {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> queue = new LinkedList<Integer>(); //LinkedList ��� 
		for(int i=10;i>=0;i--) {				//10�� ���� �ð��� �پ��� 10���� 0���� LinkedList�� ���� 
			queue.add(i);
		}
		for(int i=0;i<=10;i++) {				//0���� 10���� ���� ��� Thread�� sleep�Լ��� 1�� ���� (ms ���� ��� 1 = 0.001��)
			System.out.println(queue.get(i));
			Thread.sleep(1000);
		}
	}
}
