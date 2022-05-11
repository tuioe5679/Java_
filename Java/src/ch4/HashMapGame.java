package ch4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class HashMapGame {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("����, ����,�� ���� ����(1:����, 2:����, 3:��) : ");
		int user = stdin.nextInt()-1;
		Random random = new Random();
		int com = random.nextInt(3);
		HashMap<Integer,String> hash = new HashMap<>();
		hash.put(0, "����");
		hash.put(1, "����");
		hash.put(2, "��");
		Object value1 = hash.get(user);
		System.out.println("����� " + value1 + " �� �½��ϴ�");
		Object value2 = hash.get(com);
		System.out.println("��ǻ�ʹ� " + value2 + " �� �½��ϴ�");
		System.out.println();
		System.out.print("���Ӱ��: ");
		if(user==com) {
			System.out.println("�����ϴ�");
		}
		else if(user==(com+1)%3) {
			System.out.println("����� �̰���ϴ�");
		}
		else {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}

	}

}
