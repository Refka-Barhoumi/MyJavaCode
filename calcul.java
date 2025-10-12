import java.util.Scanner;
public class calcul
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //System.in représente le clavier
		System.out.println("Entrez la valeur de a: ");
		double a =input.nextDouble();
		
		System.out.println("Entrez la valeur de b: ");
		double b =input.nextDouble();
		
		double somme2 =a+b;
		System.out.println("La somme de deux nombres: "+somme2);
		
		System.out.println("Entrez la valeur de c: ");
		double c =input.nextDouble();
	
		double somme3 =a+b+c;
		double produit3 =a*b*c;
		double moyenne =somme3/3;
		
		System.out.println("Entrez une phrase: ");
		input.nextLine();
		String phrase=input.nextLine();
		System.out.println(phrase+" la somme de trois nombres: "+somme3);
		System.out.println("Le produit de trois nombres: "+produit3);
		System.out.println("La moyenne: "+moyenne);
		

	}
}
