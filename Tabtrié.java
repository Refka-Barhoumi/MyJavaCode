
/*
 * Exercice 1 : Créer un tableau de 5 entiers
 * le remplir, l’afficher, le trier puis l’afficher à nouveau
 */
 
import java.util.Arrays;
import java.util.Scanner;

public class Tabtrié {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Déclaration et création d’un tableau de 5 cases ---
        int tab[] = new int[5];

        // --- Remplissage du tableau par saisie clavier ---
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Saisir la valeur " + (i + 1) + " : ");
            tab[i] = input.nextInt();
        }

        // --- Affichage du tableau avant le tri ---
        System.out.println("\nTableau initial : " + Arrays.toString(tab));

        // --- Tri du tableau dans l’ordre croissant ---
        Arrays.sort(tab);

        // --- Affichage du tableau après le tri ---
        System.out.println("Tableau trié (ordre croissant) : " + Arrays.toString(tab));

        // --- Tri manuel en ordre décroissant ---
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }

        // --- Affichage du tableau trié en ordre décroissant ---
        System.out.println("Tableau trié (ordre décroissant) : " + Arrays.toString(tab));
    }
}
