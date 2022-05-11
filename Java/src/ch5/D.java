package ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class D {

	public static void main(String[] args) throws FileNotFoundException {
		TreeMap<String,Integer> map = new TreeMap<>();
		Scanner stdin = new Scanner(new File("test.txt"));
		int count = 1;
		while(stdin.hasNext()) {
			map.put(stdin.next(), count); 
		}
		System.out.println(map.descendingMap());
	}
}
