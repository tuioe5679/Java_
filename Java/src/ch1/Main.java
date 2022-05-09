package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner stdin = new Scanner(System.in);
		
		int a,b,c = 0;
		String[] st = br.readLine().split(" ");
		c = Integer.parseInt( br.readLine());
		a = Integer.parseInt(st[0]);
		b = Integer.parseInt(st[1]);
		
		int sumtime;
		int timea;
		int timeb;
		
		sumtime = a+b;
		
		timea = sumtime%60;
		timeb = sumtime/60;
		
		
		System.out.println((a+timea) + " " + (b+timeb));
		
		
		
		
		
	}

}
