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
		    JRadioButton jr1 = new JRadioButton("A형");
		    pt2.add(jr1);
		    JRadioButton jr2 = new JRadioButton("B형");
		    pt2.add(jr2);
		    JRadioButton jr3 = new JRadioButton("O형");
		    pt2.add(jr3);
		    pt3 = new JPanel();
		    pt3.setLayout(new GridLayout()); 
		    JButton bt1 = new JButton(" 선  택 ");
		    JButton bt2 = new JButton(" 취  소 ");
		    pt3.add(bt1);
		    pt3.add(bt2);

		    pt.add(pt1);
		    pt.add(pt2);
		    pt.add(pt3);
		    
		    pb = new JPanel();
		    pb1 = new JPanel();
		    JTextArea ta = new JTextArea("자료입력공간",5,30);
		    pb.add(ta);   
		    
		    pb2 = new JPanel();
		    JComboBox jcb = new JComboBox();
		    jcb.addItem("1구간 지역");
		    jcb.addItem("2구간 지역");
		    jcb.addItem("3구간 지역");
		    jcb.addItem("4구간 지역");
		    jcb.addItem("5구간 지역");
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
