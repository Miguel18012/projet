package transport;

import java.util.ArrayList;
import java.util.List;
public class Agence {

    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private List<Bus> buses;
    private List<Ligne> lignes;

    // Constructeur
    public Agence(int id, String nom, String adresse, String telephone, String email) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.buses = new ArrayList<>();
        this.lignes = new ArrayList<>();
    }

    // Méthodes métier
    public void ajouterBus(Bus bus) {
        this.buses.add(bus);
    }

    public void ajouterLigne(Ligne ligne) {
        this.lignes.add(ligne);
    }

    public List<Bus> getBusDisponibles() {
        List<Bus> disponibles = new ArrayList<>();
        for (Bus b : buses) {
            if (b.isDisponible()) {
                disponibles.add(b);
            }
        }
        return disponibles;
    }

    public void afficherInfo() {
        System.out.println("=== AGENCE: " + nom + " ===");
        System.out.println("Adresse   : " + adresse);
        System.out.println("Telephone : " + telephone);
        System.out.println("Email     : " + email);
        System.out.println("Nb Bus    : " + buses.size());
        System.out.println("Nb Lignes : " + lignes.size());
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Bus> getBuses() { return buses; }
    public List<Ligne> getLignes() { return lignes; }
}
