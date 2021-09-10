//Java miniopdracht 2
import java.util.Scanner;

public class Counte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voer het woord in om e's te tellen: ");
		String woord = sc.nextLine();
		
		int aantal = 0;
		for(int i=0; i < woord.length() ; i++) {
			if (woord.charAt(i) == 'e') {
					aantal = aantal + 1;
			}
		}
		System.out.println("Het aantal e's in " + woord + " is: " + aantal);
		
	}
	
}
