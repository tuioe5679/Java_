package ch1;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class GUIExam{
	
	public GUIExam() {
		//1. ������ ���� 
		JFrame jf = new JFrame("ù��° GUI ���α׷�");
		
		//2. (1)�� �´� �����̳� ��ü ���� 
		Container ct = jf.getContentPane();
		
		//3. �����̳� ���� 
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		
		//4. (2)�� �����̳ʿ� ��� 
		ct.add(btn1);
		ct.add(btn2);
		
		//5. ���&ũ�⼳��
		jf.setSize(300,400);
		jf.setVisible(true);
	}
}
public class Task01 {
	
	public static void main(String[] args) {
		//6. Ŭ������ ��ü ���� 
		GUIExam gui = new GUIExam();
	}
}
