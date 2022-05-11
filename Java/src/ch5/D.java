package ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Integer> map = new TreeMap<String,Integer>();			//TreeMap ���
		Scanner stdin = new Scanner(new File("test.txt"));					//Sanner Ŭ������ ���� ������ ������ 
		int count = 1;														//���� (Value)
		while(stdin.hasNext()) {											//test.txt ������ ��ū�� ���������� �ݺ�  
			String sa = stdin.next();				
			count = map.containsKey(sa) ? count+1 : count;					//���� ������ ���� 									
			map.put(sa, count);
		}
		for(String key: map.keySet()) {										//String ��ü key�� map Ű�� �����鼭 �ݺ��ϴ� ���� for�� 
			System.out.println(key + "-->" + map.get(key));					//key���� value���� ��� 	
		}
		System.out.println("��ü �ܾ� ��: " + map.size());						//map�� ���� ��� 
	}
}
