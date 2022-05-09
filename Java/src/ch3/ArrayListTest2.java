package ch3;

import java.util.ArrayList;

class Box{
	String color;
	public int vol;
	
	public Box(String c,int w,int d,int h) {
		color = c;
		vol = w*d*h;
	}
	
	@Override public String toString() {
		return color+"박스";
	}
	
}

public class ArrayListTest2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList box = new ArrayList();
		box.add("전체박스");
		box.add(new Box("white",3,3,3));
		box.add(new Box("red",5,5,5));
		box.add(new Box("black",7,7,7));
		System.out.println(box.get(0)+":"+box.subList(1, 4));
		
		for(int i=1;i<box.size();i++) {
			Box b = (Box)box.get(i);
			System.out.println(b.color+"부피: "+b.vol);
		}
	}
}
