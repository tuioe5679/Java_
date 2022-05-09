package ch4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		
		lm.put("����",98);
		lm.put("����",100);
		lm.put("����",86);
		lm.put("��ȸ",99);
		lm.put("����",89);
		
		System.out.println("����: " + lm);
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
		
		return "����: " + sum/count;
	}
}
