package ch2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.ByteOrder;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
class GUIExam2 extends Layout{
	
	public GUIExam2() {
		//1.
		jb = new JButton("테스트버튼");
		ct.add(jb);
		setTitle("세 번째 GUI");
		
		setVisible(true);
	}	
}

@SuppressWarnings("serial")
class GUIExam3 extends Layout{
	
	public GUIExam3() {
		
		fl = new FlowLayout(FlowLayout.CENTER,10,10);
		ct.setLayout(fl);
		for(int i=0;i<=15;i++) {
			ct.add(new JButton("버튼"+i));
		}
		setTitle("FlowLayout");
		setSize(200,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		
}

@SuppressWarnings("serial")
class GUIExam4 extends Layout{
	public GUIExam4() {
		bl = new BorderLayout(10,10);
		ct.setLayout(bl);
		ct.add(new JButton("오른쪽 버튼"), BorderLayout.EAST);
		ct.add(new JButton("왼족 버튼"), BorderLayout.WEST);
		ct.add(new JButton("위쪽 버튼"), BorderLayout.NORTH);
		ct.add(new JButton("아래쪽 버튼"), BorderLayout.SOUTH);
		ct.add(new JButton("중앙 버튼"), BorderLayout.CENTER);
		
		setSize(400,500);
		setVisible(true);
	}
}

@SuppressWarnings("serial")
class GridLayout1 extends Layout{
	public GridLayout1() {
		GridLayout gl = new GridLayout(4,5,10,10);
		ct.setLayout(gl);
		for(int i=1;i<=20;i++) {
			ct.add(new JButton("버튼"+i));
		}
		setSize(800,800);
		setVisible(true);
	}
}

@SuppressWarnings("serial")
class JPanl1 extends Layout{
	public JPanl1() {
		ct.setLayout(new BorderLayout(5,5));
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		jp1.add(new JRadioButton("자바"));
		jp1.add(new JRadioButton("C"));
		jp1.add(new JRadioButton("VisualBasic"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("PHP"));
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5,1));
		jp2.add(new JButton("자바"));
		jp2.add(new JButton("C"));
		jp2.add(new JButton("VisualBasic"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("PHP"));
		ct.add(jp1,BorderLayout.EAST);
		ct.add(jp2,BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
}
public class Task01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		String s = "GUIExam2";
	
		switch(a) {
		case 1:
			GUIExam2 ge = new GUIExam2();
		case 2:
			GUIExam3 ge2 = new GUIExam3();
			break;
		case 3:
			GUIExam4 ge3 = new GUIExam4();
			break;
		case 4:
			GridLayout1 gr = new GridLayout1();
			break;
		case 5:
			JPanl1 jp = new JPanl1();
			break;
		}
		
	}

}
