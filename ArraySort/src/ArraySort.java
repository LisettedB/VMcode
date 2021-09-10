//Java miniopdracht 4
import java.util.Random;
import java.util.ArrayList;
//import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {
		ArrayList<Integer> Getallen = new ArrayList<Integer>();
		ArrayList<Integer> GetallenSort = new ArrayList<Integer>();
		for(int i=0; i<10 ; i++) {
			int plaats = 0;
			Random r = new Random();
			int getal = r.nextInt(100);
			Getallen.add(getal);
			
			for (int j=0; j<Getallen.size(); j++) {
				
				if(getal>Getallen.get(j)) {
					plaats = plaats + 1;
				}
			}
			GetallenSort.add(plaats, getal);
		}
		System.out.println(Getallen);
		System.out.println(GetallenSort);
		//Collections.sort(Getallen);
		//System.out.println(Getallen);
	}	
}
