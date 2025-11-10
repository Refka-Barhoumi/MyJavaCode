

// Classe Rectangle 
class Rectangle {
    private double longueur; // longueur du rectangle
    private double largeur;  // largeur du rectangle

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur; // initialiser la longueur
        this.largeur = largeur;   // initialiser la largeur
    }

    // Méthode pour calculer la surface
    public double surface() {
        return longueur * largeur; // surface = longueur × largeur
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur); // périmètre = 2 × (longueur + largeur)
    }

    // Méthode pour afficher les informations
    public void afficher() {
        System.out.println("Surface = " + surface());     // afficher la surface
        System.out.println("Périmètre = " + perimetre()); // afficher le périmètre
    }
}

// Classe de test 
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 3.0); // créer un rectangle
        r.afficher(); // afficher ses propriétés
    }
}
