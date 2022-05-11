package ch5;

import java.util.LinkedList;

public class B {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> queue = new LinkedList<Integer>(); //LinkedList 사용 
		for(int i=10;i>=0;i--) {				//10초 부터 시간이 줄어드니 10부터 0까지 LinkedList에 저장 
			queue.add(i);
		}
		for(int i=0;i<=10;i++) {				//0부터 10까지 값을 출력 Thread의 sleep함수로 1초 지연 (ms 단위 사용 1 = 0.001초)
			System.out.println(queue.get(i));
			Thread.sleep(1000);
		}
	}
}
