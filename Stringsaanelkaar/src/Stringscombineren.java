//Java miniopdracht 1
import java.util.Scanner;

public class Stringscombineren {
	public static void main(String[] args) {
		String str1 = "Fiets";
		String str2 = "band";
		String str3 = "en";
		String result;
		result = str1+str2+str3;
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Voer hier deel 1 in: ");
		String deel1 = sc.nextLine();
		System.out.println("Voer hier deel 2 in: ");
		String deel2 = sc.nextLine();
		System.out.println("Voer hier deel 3 in: ");
		String deel3 = sc.nextLine();
		
		String result2 = deel1.concat(deel2).concat(deel3);
		System.out.println(result2);
		
	}
}
