package LargestOf3;

import java.util.Scanner;

public class FourthMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max =max(a, b, c);
		System.out.println("Largest of the three is " + max);
		int min = min(a, b, c);
		System.out.println("Smallest of the three is " + min);
	}
	static int max(int a,int b,int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
	static int min (int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}

}
