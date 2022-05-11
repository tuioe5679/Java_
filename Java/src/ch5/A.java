package ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Double> al = new ArrayList<>();
		Double sum = 0.0;
		for(int i=0;i<10;i++) {
			System.out.print("심사위원 점수: ");
			al.add(stdin.nextDouble());
		}
		;
		Collections.min(al);
		for(int i=0;i<10;i++) {
			if(al.get(i)==Collections.max(al)) {
				sum+=0;
			}
			else if(al.get(i)==Collections.min(al)) {
				sum+=0;
			}
			else {
				sum += al.get(i);
			}
		}
		System.out.println("점수 합: " + sum);
	}
}
