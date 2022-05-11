package ch4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class HashMapGame {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("가위, 바위,보 게임 선택(1:가위, 2:바위, 3:보) : ");
		int user = stdin.nextInt()-1;
		Random random = new Random();
		int com = random.nextInt(3);
		HashMap<Integer,String> hash = new HashMap<>();
		hash.put(0, "가위");
		hash.put(1, "바위");
		hash.put(2, "보");
		Object value1 = hash.get(user);
		System.out.println("당신은 " + value1 + " 를 냈습니다");
		Object value2 = hash.get(com);
		System.out.println("컴퓨터는 " + value2 + " 를 냈습니다");
		System.out.println();
		System.out.print("게임결과: ");
		if(user==com) {
			System.out.println("비겼습니다");
		}
		else if(user==(com+1)%3) {
			System.out.println("당신이 이겼습니다");
		}
		else {
			System.out.println("컴퓨터가 이겼습니다");
		}

	}

}
