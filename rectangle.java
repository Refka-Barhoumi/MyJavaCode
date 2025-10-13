/**
 * Exercice 1 - Calcul de la surface d'un rectangle
 * objectif :Lire la longueur et la largeur, puis afficher la surface du rectangle
 * */

import java.util.Scanner;

public class rectangle{
    // Déclaration des attributs
    double longueur ;
    double largeur ;
    
    // Constructeur avec "this" 
    public rectangle (double longueur,double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    // Méthode pour calculer la surface du rectangle
    public double calculerSurface(){
        return this.longueur * this.largeur;
    }
    
    // Méthode principale
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
    
        System.out.print("Saisir la longueur du rectangle : ");
        double longueur = input.nextDouble();
        
        System.out.print("Saisir la largeur du rectangle : ");
        double largeur = input.nextDouble();
        
        
        rectangle rec = new rectangle(longueur,largeur);
    
        // Affichage du résultat
        System.out.println("La Surface du rectangle est "+ rec.calculerSurface());
    }
}

