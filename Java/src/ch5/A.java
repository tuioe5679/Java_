package ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Double> al = new ArrayList<Double>();
		Double sum = 0.0;
		for(int i=0;i<10;i++) {  			//�ɻ������� �Է��� ������ ArrayList�� �߰� 
			System.out.print("�ɻ����� ����: ");
			al.add(stdin.nextDouble());
		}
		for(int i=0;i<10;i++) {				//sum ������ ArrayList�� ���� ����
			sum += al.get(i);
		}
		sum-=Collections.min(al);			//CollectionsŬ������ min�Լ��� �ּҰ��� sum���� ���� 
		sum-=Collections.max(al);			//CollectionsŬ������ max�Լ��� �ִ��� sum���� ����
		System.out.println("���� ��: " + sum);
	}
}
