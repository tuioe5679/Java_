package ch4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		
		lm.put("국어",98);
		lm.put("영어",100);
		lm.put("수학",86);
		lm.put("사회",99);
		lm.put("과학",89);
		
		System.out.println("성적: " + lm);
	    System.out.println(total_avg(lm));
	}
	
	public static String total_avg(Map<String, Integer> lm) {
		int sum = 0;
		int count = lm.size();
		Collection<Integer> c = lm.values();
		Iterator<Integer> it = c.iterator();
		
		while(it.hasNext()) {
			sum += it.next();
		}
		
		return "총점: " + sum/count;
	}
}
