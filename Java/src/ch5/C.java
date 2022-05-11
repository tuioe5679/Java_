package ch5;

import java.util.HashMap;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		HashMap<Integer,String> hash = new HashMap<>();
		String s;
		hash.put(0,"자바");
		hash.put(1,"학교");
		hash.put(2,"지도");
		do{
			 System.out.print("영어 단어 입력: ");
			 s = stdin.next();
			 System.out.print("단어 의미: ");
			 switch(s) {
			 case "java":
				 System.out.println(hash.get(0));
				 break;
			 case "school":
				 System.out.println(hash.get(1));
				 break;
			 case "map":
				 System.out.println(hash.get(2));
				 break;
			 default:
				 System.out.println("단어 사전에 없습니다");
			 }
			 System.out.println();
		}while(!s.equals("quit"));
	}

}
