import java.util.Scanner;

public class Compte {
    // Solde actuel du compte
    public double solde;

    // Constructeur
    public Compte(double solde) {
        this.solde = solde;
    }

    // Vérifie si le montant à verser est valide (> 0)
    public boolean verifierVersement(Double montant) {
        return montant > 0;
    }

    // Dépose un montant sur le compte
    public void deposer(Double montant) {
        if (verifierVersement(montant)) {
            this.solde += montant;
            System.out.println("Dépôt réussi : " + montant + " DT.");
        } else {
            System.out.println("Erreur : montant de versement invalide !");
        }
    }

    // Retire un montant du compte
    public void retirer(Double montant) {
        if (montant <= 0) {
            System.out.println("Erreur : montant de retrait invalide!");
        } else if (montant > this.solde) {
            System.out.println("Erreur : solde insuffisant !");
        } else {
            this.solde -= montant;
            System.out.println("Retrait réussi : " + montant + " DT");
        }
    }

    // Effectue un virement vers un autre compte
    public void virement(Compte destinataire, Double montant) {
        if (montant <= 0) {
            System.out.println("Erreur : montant de virement invalide.");
        } else if (montant > this.solde) {
            System.out.println("Erreur : solde insuffisant pour effectuer le virement.");
        } else {
            this.solde -= montant;
            destinataire.solde += montant;
            System.out.println("Virement réussi : " + montant + " DT.");
        }
    }

    // Affiche le solde
    public void afficher() {
        System.out.println("Solde actuel = " + this.solde + " DT");
    }

    // Programme principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saisir le solde initial du compte 1 : ");
        double solde1 = input.nextDouble();

        System.out.print("Saisir le solde initial du compte 2 : ");
        double solde2 = input.nextDouble();

        Compte c1 = new Compte(solde1);
        Compte c2 = new Compte(solde2);

        System.out.println("\nAvant virement :");
        c1.afficher();
        c2.afficher();

        System.out.print("\nSaisir le montant du virement de c1 vers c2 : ");
        double montant = input.nextDouble();

        c1.virement(c2, montant);

        System.out.println("\nAprès virement :");
        c1.afficher();
        c2.afficher();

    }
}
