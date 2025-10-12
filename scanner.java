import java.util.Scanner;
public class scanner
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //System.in représente le clavier
		System.out.println("Entrez la valeur de d: ");
		double d =input.nextDouble();
		System.out.println("La valeur de d: "+d);
		System.out.println("Entrez la valeur de i: ");
		int i =input.nextInt();
		System.out.println("La valeur de i: "+i);
		System.out.println("Entrez un caractère c: ");
		char c = input.next().charAt(0);
		System.out.println("La valeur de c: "+c);
		System.out.println("Entrez une phrase: ");
		input.nextLine();
		String phrase=input.nextLine();
		System.out.println("La phrase saisie : "+phrase);
		
		
		
		System.out.println("Hello World!");
		
	}
}
