package ch2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JPanelTest extends JFrame{
	
	 public JPanelTest() {
		    JPanel pt, pb;
		    JPanel pt1, pt2, pt3;
		    JPanel pb1, pb2;

		    Container ct = getContentPane(); 
		    ct.setLayout(new BorderLayout());
		    
		    pt = new JPanel();
		    pt.setLayout(new GridLayout());
		           
		    pt1 = new JPanel(); 
		    pt1.setLayout(new GridLayout());

		    JCheckBox red = new JCheckBox("Red", true);
		    pt1.add(red);
		    JCheckBox green = new JCheckBox("Green", false);
		    pt1.add(green);
		    JCheckBox blue = new JCheckBox("Blue", false);
		    pt1.add(blue);
		    
		    pt2 = new JPanel(); 
		    pt2.setLayout(new GridLayout());
		    JRadioButton jr1 = new JRadioButton("A��");
		    pt2.add(jr1);
		    JRadioButton jr2 = new JRadioButton("B��");
		    pt2.add(jr2);
		    JRadioButton jr3 = new JRadioButton("O��");
		    pt2.add(jr3);
		    pt3 = new JPanel();
		    pt3.setLayout(new GridLayout()); 
		    JButton bt1 = new JButton(" ��  �� ");
		    JButton bt2 = new JButton(" ��  �� ");
		    pt3.add(bt1);
		    pt3.add(bt2);

		    pt.add(pt1);
		    pt.add(pt2);
		    pt.add(pt3);
		    
		    pb = new JPanel();
		    pb1 = new JPanel();
		    JTextArea ta = new JTextArea("�ڷ��Է°���",5,30);
		    pb.add(ta);   
		    
		    pb2 = new JPanel();
		    JComboBox jcb = new JComboBox();
		    jcb.addItem("1���� ����");
		    jcb.addItem("2���� ����");
		    jcb.addItem("3���� ����");
		    jcb.addItem("4���� ����");
		    jcb.addItem("5���� ����");
		    pb2.add(jcb);

		    pb.add(pb1); 
		    pb.add(pb2); 
		  }
		  public static void main(String[] args) {
		    JPanelTest jpt = new JPanelTest();
		    jpt.setTitle("Panel Test");
		    jpt.setSize(480,280); 
		    jpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    jpt.setVisible(true); 
	}
}
