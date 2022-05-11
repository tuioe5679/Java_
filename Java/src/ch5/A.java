package ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Double> al = new ArrayList<Double>();
		Double sum = 0.0;
		for(int i=0;i<10;i++) {  			//심사위원이 입력한 점수를 ArrayList에 추가 
			System.out.print("심사위원 점수: ");
			al.add(stdin.nextDouble());
		}
		for(int i=0;i<10;i++) {				//sum 변수에 ArrayList의 값을 누적
			sum += al.get(i);
		}
		sum-=Collections.min(al);			//Collections클래스의 min함수로 최소값을 sum에서 빼줌 
		sum-=Collections.max(al);			//Collections클래스의 max함수로 최댓값을 sum에서 빼줌
		System.out.println("점수 합: " + sum);
	}
}
