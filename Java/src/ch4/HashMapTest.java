package ch4;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> has = new HashMap<String,String>();
		
		has.put("성명","배이한");
		has.put("나이", "21");
		
		Object a1 = has.put("성명", "이한");
		Object a2 = has.put("국적", "대한민국");
		
		if(a2!= null) {
			System.out.println("대체된 값이 존재한다");
		}else {
			System.out.println("맵에 추가 됐다");
		}
		
		Object s = has.remove("나이");
		
		if(s!= null) {
			System.out.println("삭제된 값: " + s);
		}else {
			System.out.println("맵에서 삭제 됐다");
		}
		
		System.out.println(has);
		//이전값을 가져옴 
		System.out.println(a1);
		//이전값이 없기에 null값을 리턴 
		System.out.println(a2);

	}

}
