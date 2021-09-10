//Java miniopdracht 7 - 
import java.util.Scanner;

public class LingoCheck {
	public static void main(String[] args) {
		String woord = "kennen";
		String streepjes = "";
		for(int i=0; i<woord.length(); i++) {
			streepjes = streepjes+"-";	
		}
		System.out.println(streepjes);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Probeer het woord te raden:");
		String geraden = sc.nextLine();
		String check = "";
		String getal ="";
		int l = 0;
		for(int j=0; j<geraden.length(); j++) {
			
			for(int k=l; k<woord.length(); k++) {
				if(geraden.charAt(j) == woord.charAt(k)) {
					if(j == k) {
						getal = "2";
						l++;
						
						break;
					}else {
						getal = "1";
						break;
					}
					
				} else {
					getal = "0";
				}
			}
			check = check + getal;
		}
		System.out.println(check);
	}
}



