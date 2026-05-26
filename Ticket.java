package transport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Représente un ticket de voyage acheté en ligne
 */
public class Ticket {

    public enum Statut {
        VALIDE, UTILISE, ANNULE
    }

    private int id;
    private String code;
    private Ligne ligne;
    private Client client;
    private String dateVoyage;
    private double prix;
    private Statut statut;
    private String dateAchat;

    // Constructeur
    public Ticket(int id, Ligne ligne, Client client, String dateVoyage, double prix) {
        this.id = id;
        this.ligne = ligne;
        this.client = client;
        this.dateVoyage = dateVoyage;
        this.prix = prix;
        this.statut = Statut.VALIDE;
        this.dateAchat = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        this.code = genererCode();
    }

    // Génère un code unique pour le ticket
    private String genererCode() {
        return "TKT-" + ligne.getNumero() + "-" + id + "-"
               + System.currentTimeMillis() % 10000;
    }

    // Méthodes métier
    public void annuler() {
        if (statut == Statut.VALIDE) {
            this.statut = Statut.ANNULE;
            System.out.println("Ticket " + code + " annulé.");
        } else {
            System.out.println("Impossible d'annuler ce ticket.");
        }
    }

    public void utiliser() {
        if (statut == Statut.VALIDE) {
            this.statut = Statut.UTILISE;
        }
    }

    public void afficherInfo() {
        System.out.println("┌─────────────────────────────────┐");
        System.out.println("│ CODE    : " + code);
        System.out.println("│ Trajet  : " + ligne.getVilleDepart() + " → " + ligne.getVilleArrivee());
        System.out.println("│ Départ  : " + ligne.getHeureDepart() + " le " + dateVoyage);
        System.out.println("│ Prix    : " + prix + " FCFA");
        System.out.println("│ Statut  : " + statut);
        System.out.println("│ Acheté  : " + dateAchat);
        System.out.println("└─────────────────────────────────┘");
    }

    // Getters et Setters
    public int getId() { return id; }
    public String getCode() { return code; }

    public Ligne getLigne() { return ligne; }
    public void setLigne(Ligne ligne) { this.ligne = ligne; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getDateVoyage() { return dateVoyage; }
    public void setDateVoyage(String dateVoyage) { this.dateVoyage = dateVoyage; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public Statut getStatut() { return statut; }
    public void setStatut(Statut statut) { this.statut = statut; }

    public String getDateAchat() { return dateAchat; }
}
