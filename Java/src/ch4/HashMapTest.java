package ch4;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> has = new HashMap<String,String>();
		
		has.put("����","������");
		has.put("����", "21");
		
		Object a1 = has.put("����", "����");
		Object a2 = has.put("����", "���ѹα�");
		
		if(a2!= null) {
			System.out.println("��ü�� ���� �����Ѵ�");
		}else {
			System.out.println("�ʿ� �߰� �ƴ�");
		}
		
		Object s = has.remove("����");
		
		if(s!= null) {
			System.out.println("������ ��: " + s);
		}else {
			System.out.println("�ʿ��� ���� �ƴ�");
		}
		
		System.out.println(has);
		//�������� ������ 
		System.out.println(a1);
		//�������� ���⿡ null���� ���� 
		System.out.println(a2);

	}

}
