//Java miniopdracht 5
public class Monteur{
	
	int AutoRepareren(Auto auto) {
		int kosten = 0;
		if(auto.motor == true) {
			kosten = kosten +25;
		} 
		if(auto.deur == true) {
			kosten = kosten + 25;
		}
		if(auto.voorruit == true) {
			kosten = kosten + 25;
		}
		if(auto.uitlaat == true) {
			kosten = kosten+25;
		}
		return kosten;
	}
}
