package ch5;

import java.util.HashMap;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		HashMap<String,String> hash = new HashMap<String,String>(); //HashMap ��� 
		String s;
		hash.put("java","�ڹ�");								//HashMap�� �ܾ� �߰� 
		hash.put("school","�б�");
		hash.put("map","����");
		do{
			 System.out.print("���� �ܾ� �Է�: ");
			 s = stdin.next();
			 if(s.equals("quit")) {							//quit �ܾ� �Է½� ����
				 break;
			 }
			 else if(hash.get(s)==null) {					//Map�� �������� �ʴ� �ܾ� �Է½� ���� ��¹��� ��� 
				 System.out.println(s+"�� �ܾ� ������ �����ϴ� \n");
			 }else {										//HashMap�� get�Լ��� �Է��� ���ڿ��� �Ű������� �Ѱ��༭ �ش��ϴ� �ܾ ��ȯ�Ͽ� ��� 
				 System.out.println("�ܾ� �ǹ�: " + hash.get(s) + "\n");
			 }
		}while(true);
	}

}
