package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

	static void printnames(ArrayList<String> lname) {
		System.out.println(lname);
	}
	public static void main(String[] args) {
		String[] name = {"Kim","lee","park","jung","oh"};
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		printnames(lname);
		lname.add("배이한");
		printnames(lname);
		lname.set(4, "자바");
		printnames(lname);
		Collections.shuffle(lname);
		printnames(lname);
		Collections.sort(lname);
		printnames(lname);
		Collections.fill(lname, "");
		printnames(lname);
	}
}
