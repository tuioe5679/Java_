package ch4;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(88,"����");
		tm.put(100,"����");
		tm.put(76,"����");
		tm.put(80,"��ȸ");
		tm.put(69,"����");
		Map.Entry<Integer,String> me = tm.firstEntry();
		System.out.println("���� ���� ������" + me.getKey() + "���̸� ������"+
				           me.getValue() + "�Դϴ�");
		me = tm.lastEntry();
		System.out.println("���� ���� ������" + me.getKey() + "���̸� ������"+
						   me.getValue() + "�Դϴ�");
		Map<Integer,String> cd = tm.headMap(80);
		System.out.println("���� c,d" + cd);
		Map<Integer,String> ab = tm.tailMap(80);
		System.out.println("���� a,b" + ab);	
	}
}
