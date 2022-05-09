package ch1;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class GUIExam{
	
	public GUIExam() {
		//1. 프레임 제작 
		JFrame jf = new JFrame("첫번째 GUI 프로그램");
		
		//2. (1)에 맞는 컨테이너 객체 생성 
		Container ct = jf.getContentPane();
		
		//3. 컨테이너 생성 
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		//4. (2)에 컨테이너에 담기 
		ct.add(btn1);
		ct.add(btn2);
		
		//5. 출력&크기설정
		jf.setSize(300,400);
		jf.setVisible(true);
	}
}
public class Task01 {
	
	public static void main(String[] args) {
		//6. 클래스의 객체 생성 
		GUIExam gui = new GUIExam();
	}
}
