package transport;

/**
 * Représente une ligne de transport entre deux villes
 */
public class Ligne {

    private int id;
    private String numero;
    private String villeDepart;
    private String villeArrivee;
    private double prix;
    private double distance; // en km
    private String heureDepart;
    private Agence agence;

    // Constructeur
    public Ligne(int id, String numero, String villeDepart, String villeArrivee,
                 double prix, double distance, String heureDepart) {
        this.id = id;
        this.numero = numero;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.prix = prix;
        this.distance = distance;
        this.heureDepart = heureDepart;
    }

    // Méthodes métier
    public void afficherInfo() {
        System.out.println("Ligne " + numero + ": " + villeDepart + " → " + villeArrivee
                + " | Prix: " + prix + " FCFA | Départ: " + heureDepart);
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getVilleDepart() { return villeDepart; }
    public void setVilleDepart(String villeDepart) { this.villeDepart = villeDepart; }

    public String getVilleArrivee() { return villeArrivee; }
    public void setVilleArrivee(String villeArrivee) { this.villeArrivee = villeArrivee; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public double getDistance() { return distance; }
    public void setDistance(double distance) { this.distance = distance; }

    public String getHeureDepart() { return heureDepart; }
    public void setHeureDepart(String heureDepart) { this.heureDepart = heureDepart; }

    public Agence getAgence() { return agence; }
    public void setAgence(Agence agence) { this.agence = agence; }
}
