import java.util.Scanner;

class Demo2{
	public static void main(String[] args) {
		System.out.println("Ik ga op vakantie en ik neem mee");
		System.out.println("Geef een artikel in: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(input.charAt(input.length()-1));
		System.out.println("Einde");
	}
}