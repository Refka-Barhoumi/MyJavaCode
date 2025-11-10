// Classe Point
class Point {
    public double abscisse; // abscisse du point
    public double ordonnee; // ordonnée du point

    // Constructeur
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse; // initialiser l'abscisse
        this.ordonnee = ordonnee; // initialiser l'ordonnée
    }
}

// Classe Cercle
class Cercle {
    private Point centre; // centre du cercle
    private double rayon; // rayon du cercle

    // Constructeur
    public Cercle(Point centre, double rayon) {
        this.centre = centre; // initialiser le centre
        this.rayon = rayon;   // initialiser le rayon
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * Math.PI * rayon; // périmètre = 2 × π × r
    }

    // Méthode pour calculer la surface
    public double surface() {
        return Math.PI * rayon * rayon; // surface = π × r²
    }

    // Méthode pour afficher les informations du cercle
    public void afficher() {
        System.out.println("Centre : (" + centre.abscisse + ", " + centre.ordonnee + ")"); // afficher le centre
        System.out.println("Rayon : " + rayon);                                             // afficher le rayon
        System.out.println("Périmètre : " + perimetre());                                   // afficher le périmètre
        System.out.println("Surface : " + surface());                                       // afficher la surface
    }
}

// Classe de test 
public class TestCercle {
    public static void main(String[] args) {
        Point p = new Point(5.0, 2.0); // créer un point
        Cercle c = new Cercle(p, 4.0); // créer un cercle avec ce point comme centre et rayon 4

        c.afficher(); // afficher les informations du cercle
    }
}

