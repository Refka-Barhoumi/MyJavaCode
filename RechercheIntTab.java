
/**
 * Exercice 2 : Rechercher un entier dans un tableau et afficher
                son dernier indice s’il apparaît plusieurs fois.
 */
import java.util.Scanner;

public class RechercheIntTab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Tableau prédéfini ---
        int tab[] = {4, 7, 2, 7, 9, 1, 7};

        // --- Lecture de la valeur à rechercher ---
        System.out.print("Saisir un entier à rechercher : ");
        int n = input.nextInt();

        int indice = -1; // -1 indique que l’élément n’a pas encore été trouvé

        // --- Parcours du tableau ---
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                indice = i; // Retenir le dernier indice trouvé
            }
        }

        // --- Affichage du résultat ---
        if (indice == -1)
            System.out.println("\n" + n + " n’appartient pas au tableau.");
        else
            System.out.println("\n" + n + " appartient au tableau à l’indice " + indice + ".");
    }
}
