package ch2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

abstract class Layout extends JFrame{
	
	Container ct = getContentPane();
	BorderLayout bl = new BorderLayout();
	JButton jb = new JButton();
	FlowLayout fl = new FlowLayout();
	
}
