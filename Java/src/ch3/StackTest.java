package ch3;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("����");
		stack.push("��⵵");
		stack.push("��û��");
		
		while(!stack.empty()) { //empty �����Ͱ� ������ ����
			System.out.println(stack.pop());	
		}
	}
}
