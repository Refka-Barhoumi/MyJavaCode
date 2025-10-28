
/**
 * Exercice 3 : Créer un tableau de taille n
                dont chaque case contient la somme des entiers de 0 à i.
 */
import java.util.Scanner;
 
public class TabSomme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Lecture de la taille du tableau ---
        System.out.print("Saisir la taille du tableau n : ");
        int n = input.nextInt();

        int tab[] = new int[n];

        // --- Remplissage du tableau ---
        for (int i = 0; i < n; i++) {
            // Somme des entiers de 0 à i = (i * (i + 1)) / 2
            tab[i] = (i * (i + 1)) / 2;
        }

        // --- Affichage du tableau ---
        System.out.println("\nContenu du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }
}
