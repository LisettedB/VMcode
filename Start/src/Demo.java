import java.util.Scanner;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Wandeling wandeling1 = new Wandeling("Zuid-Holland");
		wandeling1.nrRestaurants = 5;
		wandeling1.lengte = 9.80;
		wandeling1.naam = "Rivierenloop";
		wandeling1.moeilijkheidsclasse = 'A';
		wandeling1.parkeerplaats = true;
		wandeling1.wandelinggelopen();
		System.out.println(wandeling1.wandelinggelopen);
		wandeling1.stappennaarafstand(10000);
		System.out.println(wandeling1.stappennaarafstand(10000));
		Wandeling wandeling2 = new Wandeling("Noord-Brabant");
		System.out.println(wandeling1.langstewandelingbestaand);
		wandeling1.langstewandelingbestaand = 195;
		System.out.println(wandeling2.langstewandelingbestaand);
		
		Rusten rustRivierenloop = new Rusten();
		System.out.println(rustRivierenloop.rustnodig(wandeling1));
		System.out.println(wandeling1.provincie);
		System.out.println(wandeling2.provincie);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Voer hier uw naam in: ");
		String ingevoerd = sc.nextLine();
		System.out.println("Uw naam is: "+ ingevoerd);
		System.out.println("Uw beginletter is: "+ ingevoerd.charAt(0));
	
		Random r = new Random();
		int gedobbeld = r.nextInt(6);
		System.out.println(gedobbeld);
				
	}
	
}

class Wandeling {
	final String provincie;
	Wandeling(String provincieP){
		this.provincie = provincieP;
	}
	int nrRestaurants;
	double lengte;
	String naam;
	char moeilijkheidsclasse;
	boolean parkeerplaats;
	boolean wandelinggelopen = false;
	double afstandgelopen;
	static int langstewandelingbestaand = 183;
	
	
	boolean wandelinggelopen() {
		wandelinggelopen = true;
		return wandelinggelopen;
	}
	
	double stappennaarafstand(int stappen) {
		afstandgelopen = stappen * 0.85;
		return afstandgelopen;
		
	}
}

class Rusten {
	boolean rust;
	boolean rustnodig(Wandeling w) {
		if (w.lengte > 10) {
			rust = true;
		}else {
			rust = false;
	}
	return rust;
	}
}