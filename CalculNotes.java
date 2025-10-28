
/*
 * Exercice 4 : Lire les notes d’une classe 
                et afficher la somme, la moyenne, la note maximale et minimale.
 */
 
import java.util.Scanner;

public class CalculNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Lecture du nombre d'élèves ---
        System.out.print("Saisir le nombre d’élèves : ");
        int n = input.nextInt();

        double notes[] = new double[n]; // Tableau des notes
        double somme = 0;

        // --- Saisie des notes ---
        for (int i = 0; i < n; i++) {
            System.out.print("Note de l’élève " + (i + 1) + " : ");
            notes[i] = input.nextDouble();
            somme += notes[i]; // Ajout à la somme totale
        }

        // --- Initialisation des valeurs max et min ---
        double max = notes[0];
        double min = notes[0];

        // --- Recherche du maximum et du minimum ---
        for (int i = 1; i < n; i++) {
            if (notes[i] > max) max = notes[i];
            if (notes[i] < min) min = notes[i];
        }

        // --- Calcul de la moyenne ---
        double moyenne = somme / n;

        // --- Affichage des résultats ---
        System.out.println("\n===== Résultats =====");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note maximale   : " + max);
        System.out.println("Note minimale   : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}
