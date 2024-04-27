package CharacterCaseCheck;

import java.util.Scanner;

public class main {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().trim().charAt(0);
			// .trim() removes the extra space from the string
			// .charAt(0) means give me the character at 0 index from the string

			if (ch >= 'a' && ch <= 'z') { // && is used to check both the situation is true
				System.out.println("lowercase");
			} else {
				System.out.println("UPPERCASE");
			}

			System.out.println(ch);
		}
}
