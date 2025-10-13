/**
 * Exercice 1 - Calcul de la surface d'un cercle
 * objectif :Saisir le rayon d'un cercle et afficher sa surface
 * */

import java.util.Scanner;

public class cercle{
    // Déclaration de l'attribut
    final double pi=3.14;
    double rayon ;
    
    // Constructeur utilisant "this" pour différencier l'attribut du paramètre
    public cercle (double rayon){
        this.rayon=rayon;
    }
    
    // Méthode pour calculer la surface du cercle
    public double calculerSurface(){
        return pi*rayon*rayon;
        //return Math.PI * this.rayon * this.rayon ;
    }
    // Méthode principale
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
    
        System.out.print("Saisir le rayon du cercle : ");
        double r = input.nextDouble();
    
        // Création d'un objet cercle à partir du rayon saisi
        cercle c = new cercle(r);
    
        // Affichage du résultat
        System.out.println("La Surface du cercle = "+c.calculerSurface());
    }
}

