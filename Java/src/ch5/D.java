package ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Integer> map = new TreeMap<String,Integer>();			//TreeMap 사용
		Scanner stdin = new Scanner(new File("test.txt"));					//Sanner 클래스로 파일 내용을 가져옴 
		int count;														//개수 (Value)
		while(stdin.hasNext()) {											//test.txt 파일의 토큰이 없을때까지 반복  
			String sa = stdin.next();				
			count = map.containsKey(sa) ? map.get(sa) + 1 : 1;
			map.put(sa, count);
		}
		for(String key: map.keySet()) {										//String 객체 key에 map 키를 넣으면서 반복하는 향상된 for문 
			System.out.println(key + "-->" + map.get(key));					//key값과 value값을 출력 	
		}
		System.out.println("전체 단어 수: " + map.size());						//map의 길이 출력 
	}
}
