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

class JPanel2 extends JFrame{
	public JPanel2() {
		JPanel pt = new JPanel();
		JPanel pb = new JPanel();
		JPanel pt1 = new JPanel();
		JPanel pt2 = new JPanel();
		JPanel pt3 = new JPanel();
		JPanel pb1 = new JPanel();
		JPanel pb2 = new JPanel();
		
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		pt1 = new JPanel();
		pt1.setLayout(new GridLayout(3,1));
		
		JCheckBox jc1 = new JCheckBox("Red");
		JCheckBox jc2 = new JCheckBox("Green");
		JCheckBox jc3 = new JCheckBox("Blue");
		
		pt1.add(jc1);
		pt1.add(jc2);
		pt1.add(jc3);
		
		pt2 = new JPanel();
		pt2.setLayout(getLayout());
		
		JRadioButton jr1 = new JRadioButton("A형");
		JRadioButton jr2 = new JRadioButton("B형");
		JRadioButton jr3 = new JRadioButton("O형");
		
		pt2.add(jr1);
		pt2.add(jr2);
		pt2.add(jr3);
		
		pt3 = new JPanel();
		pt3.setLayout(getLayout());
		
		JButton jb1 = new JButton("선택");
		JButton jb2 = new JButton("취소");
		
		pt3.add(jb1);
		pt3.add(jb2);
		
		pt.add(pt1);
		pt.add(pt2);
		pt.add(pt3);
		
		JTextArea ta = new JTextArea("자료입력공간", 5, 30);
		
		pb1.add(ta);
		
		JComboBox jcb = new JComboBox();
		jcb.addItem("1구간 지역");
		pb2.add(jcb);
		
		pb.add(pb1);
		pb.add(pb2);
		
		ct.add(pt);
		ct.add(pb);
		
		setTitle("Frame Test");
		setSize(500,300);
		setVisible(true);
		}
}
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel2();
	}

}
