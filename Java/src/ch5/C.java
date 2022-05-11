package ch5;

import java.util.HashMap;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		HashMap<String,String> hash = new HashMap<String,String>(); //HashMap 사용 
		String s;
		hash.put("java","자바");								//HashMap에 단어 추가 
		hash.put("school","학교");
		hash.put("map","지도");
		do{
			 System.out.print("영어 단어 입력: ");
			 s = stdin.next();
			 if(s.equals("quit")) {							//quit 단어 입력시 종료
				 break;
			 }
			 else if(hash.get(s)==null) {					//Map에 존재하지 않는 단어 입력시 다음 출력문을 출력 
				 System.out.println(s+"는 단어 사전에 없습니다 \n");
			 }else {										//HashMap의 get함수로 입력한 문자열을 매개변수로 넘겨줘서 해당하는 단어를 반환하여 출력 
				 System.out.println("단어 의미: " + hash.get(s) + "\n");
			 }
		}while(true);
	}

}
