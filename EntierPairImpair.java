/**
 * Exercice 2 - Vérifier si une valeur est un entier et déterminer sa parité
 * objectif : Tester si la saisie est un entier , puis indiquer s'il est pair ou impair
 * */

import java.util.Scanner;

public class EntierPairImpair {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Saisir une valeur : ");
        // Lecture de la saisie sous forme de texte
        String saisie = input.nextLine();
        
        try{
            // La conversion de la saisie en entier
            int nb = Integer.parseInt(saisie);
            System.out.println("La valeur saisie est un entier : "+ nb);
            
            // Vérification de la parité
            if (nb % 2 == 0)
                System.out.println(" Ce nombre est pair");
            else
                System.out.println(" Ce nombre est impair");
        } catch (NumberFormatException e){
            // Gestion de l'erreur si la conversion échoue
            System.out.println(" Erreur : la valeur saisie n'est pas un entier !");
        }
        
    }    
}

