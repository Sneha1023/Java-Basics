package Count_Occurence_Of_Num;

public class Main {
	public static void main(String[] args) {
		int n = 54635255;
		
		int count = 0;
		while(n > 0) {
			int rem = n % 10;
			if ( rem == 5) {
				count++;
			}
			n = n / 10; //n/= 10
		}
		System.out.println(count);
	}
}
