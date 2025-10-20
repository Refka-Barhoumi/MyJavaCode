/**
 * Programme : Gestion simple des employés
 * Objectif  : Saisir les informations de plusieurs employés (nom, prénom, âge, salaire)
               puis afficher le salaire le plus élevé.
 * Auteur    : Refka Barhoumi
 * Date      : 20 Octobre 2025
 */

package ex2;
import java.util.ArrayList;
import java.util.Scanner;

public class employé { 
    public static void main(String[] args) {

        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner input = new Scanner(System.in);

        // Liste dynamique pour stocker les salaires des employés
        ArrayList<Double> salaires = new ArrayList<>();

        // Déclaration des variables nécessaires
        String nom, prenom;
        int age;
        double salaire;
        String choix;

        // Boucle permettant de saisir plusieurs employés
        do {
            System.out.println("\n=== Saisie des informations d'un employé ===");

            // Lecture du nom
            System.out.print("Nom : ");
            nom = input.nextLine();

            // Lecture du prénom
            System.out.print("Prénom : ");
            prenom = input.nextLine();

            // Lecture de l'âge
            System.out.print("Age : ");
            age = input.nextInt();

            // Lecture du salaire
            System.out.print("Salaire : ");
            salaire = input.nextDouble();

            // Vider le tampon pour éviter des erreurs de lecture
            input.nextLine();

            // Ajout du salaire à la liste
            salaires.add(salaire);

            // Demander à l'utilisateur s'il veut ajouter un autre employé
            System.out.print("Voulez-vous ajouter un autre employé ? (o/n) : ");
            choix = input.nextLine().toLowerCase();

        } while (choix.equals("o")); // Répéter tant que l'utilisateur tape "o"

        // Vérification : au moins un salaire a été saisi
        if (!salaires.isEmpty()) {

            // Initialisation du salaire maximum avec le premier élément de la liste
            double maxSalaire = salaires.get(0);

            // Parcourir la liste pour trouver le salaire le plus grand
            for (double s : salaires) {
                if (s > maxSalaire) {
                    maxSalaire = s;
                }
            }

            // Affichage du salaire le plus élevé
            System.out.println("\nLe salaire le plus grand est : " + maxSalaire + " DT.");

        } else {
            // Cas où aucun employé n'a été saisi
            System.out.println("\nAucun employé saisi.");
        }
        // Fin du programme
        System.out.println("\n=== Fin du programme ===");
    }
}
