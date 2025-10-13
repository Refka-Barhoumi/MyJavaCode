/**
 * Exercice 3 - Vérifier si une année est bissextile
 * objectif : Saisir une anée et afficher si elle est bissextile ou non
 * */

import java.util.Scanner;

public class Anneebissextile {
    
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
        System.out.print("Saisir une année : ");
        int annee = input.nextInt();
        // condition pour une année bissextile :
        // Divisible par 4 et non par 100, ou divisible par 400
        boolean bissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
        
        if (bissextile)
            System.out.print(annee + " est une année bissextile ");
        else
            System.out.print(annee + " n'est pas une année bissextile ");
        
    }    
}

