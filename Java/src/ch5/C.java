package ch5;

import java.util.HashMap;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		HashMap<Integer,String> hash = new HashMap<>();
		String s;
		hash.put(0,"�ڹ�");
		hash.put(1,"�б�");
		hash.put(2,"����");
		do{
			 System.out.print("���� �ܾ� �Է�: ");
			 s = stdin.next();
			 System.out.print("�ܾ� �ǹ�: ");
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
				 System.out.println("�ܾ� ������ �����ϴ�");
			 }
			 System.out.println();
		}while(!s.equals("quit"));
	}

}
