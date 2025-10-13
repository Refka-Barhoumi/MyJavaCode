/**
 * Exercice 4 - Calculatrice simple
 * objectif : Lire une opération (a opérateur b) et afficher le résultat
 * */

import java.util.Scanner;

public class calculatrice {
    
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
        System.out.print("Saisir une opération (exemple: 9 + 3 ): ");
        double a = input.nextDouble();
        char operateur = input.next().charAt(0);
        double b = input.nextDouble();
        
        double resultat;
        
        // Utilisation d'un switch pour choisir l'opération
        switch (operateur){
            case '+' -> resultat = a + b;
            case '-' -> resultat = a - b;
            case '*' -> resultat = a * b;
            case '/' -> {
                if (b == 0){
                    System.out.println("Erreur : division par zéro ! ");
                    return;
                }
                resultat = a / b;
            }
            default -> {
                System.out.println("Erreur :opérateur non reconnu ! ");
                return;
            }
        }
        System.out.print("Résultat = "+ resultat);
    }    
}
