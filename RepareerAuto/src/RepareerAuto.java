//Java miniopdracht 5
public class RepareerAuto {
	public static void main(String[] args) {
		Auto autovw = new Auto(true, false, true, false);
		Auto autotesla = new Auto(true, false, false, false);
		Auto automazda = new Auto(false, true, true, true);
		
		Monteur monteurjan = new Monteur();
		Monteur monteurpiet = new Monteur();
		
		int kostenautovw = monteurjan.AutoRepareren(autovw);
		int kostenautotesla = monteurjan.AutoRepareren(autotesla);
		int kostenautomazda = monteurpiet.AutoRepareren(automazda);
		
		System.out.println(kostenautovw);
		System.out.println(kostenautotesla);
		System.out.println(kostenautomazda);	
	}
}
