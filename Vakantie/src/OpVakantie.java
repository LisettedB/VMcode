//Java miniopdracht 10
import java.util.Scanner;

public class OpVakantie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voer een woord in:");
		String lijst = sc.nextLine();
		for(int i=0; i<1000; i++) {
			System.out.println("Voer een woord in:");
			String tussenstap = sc.nextLine();
			if(tussenstap.equals("Einde!")) {
				break;
			}
			if(lijst.charAt(lijst.length()-1) == tussenstap.charAt(0)) {
				lijst = lijst + ", " + tussenstap;
			} else {
				System.out.println("Voer een woord in dat begint met de laatste letter van het vorige woord.");
				tussenstap ="";
			}
			System.out.println("Gezegd is: "+lijst);
			
		}		
	}
}
