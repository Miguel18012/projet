package transport;

/**
 * Représente un bus d'une agence de transport
 */
public class Bus {

    private int id;
    private String immatriculation;
    private int capacite;
    private String modele;
    private boolean disponible;
    private Agence agence;

    // Constructeur
    public Bus(int id, String immatriculation, int capacite, String modele) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.capacite = capacite;
        this.modele = modele;
        this.disponible = true;
    }

    // Méthodes métier
    public void afficherInfo() {
        System.out.println("Bus [" + immatriculation + "] - " + modele
                + " | Capacité: " + capacite
                + " | Disponible: " + (disponible ? "OUI" : "NON"));
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public Agence getAgence() { return agence; }
    public void setAgence(Agence agence) { this.agence = agence; }
}
