package transport;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un client qui achète des tickets en ligne
 */
public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private List<Ticket> tickets;

    // Constructeur
    public Client(int id, String nom, String prenom, String email,
                  String motDePasse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.tickets = new ArrayList<>();
    }

    // Méthodes métier
    public Ticket acheterTicket(Ligne ligne, String dateVoyage) {
        Ticket ticket = new Ticket(
            tickets.size() + 1,
            ligne,
            this,
            dateVoyage,
            ligne.getPrix()
        );
        tickets.add(ticket);
        System.out.println("✓ Ticket acheté: " + ticket.getCode());
        return ticket;
    }

    public void afficherMesTickets() {
        System.out.println("=== Tickets de " + prenom + " " + nom + " ===");
        if (tickets.isEmpty()) {
            System.out.println("Aucun ticket.");
        } else {
            for (Ticket t : tickets) {
                t.afficherInfo();
            }
        }
    }

    public boolean seConnecter(String email, String motDePasse) {
        return this.email.equals(email) && this.motDePasse.equals(motDePasse);
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public List<Ticket> getTickets() { return tickets; }
}
