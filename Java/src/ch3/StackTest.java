package ch3;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("전라도");
		stack.push("경기도");
		stack.push("충청도");
		
		while(!stack.empty()) { //empty 데이터가 없을때 까지
			System.out.println(stack.pop());	
		}
	}
}
