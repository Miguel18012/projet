package transport;

/**
 * Classe principale - Test du système de transport
 * Projet 10 : Système de transport - Ngaoundéré
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   SYSTÈME DE TRANSPORT - NGAOUNDÉRÉ  ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // 1. Créer une agence
        Agence agence = new Agence(
            1,
            "Touristique Express",
            "Rue du marché central, Ngaoundéré",
            "+237 222 25 10 10",
            "touristique@express.cm"
        );
        agence.afficherInfo();
        System.out.println();

        // 2. Créer des bus
        Bus bus1 = new Bus(1, "LT-1234-CM", 70, "Mercedes Sprinter");
        Bus bus2 = new Bus(2, "LT-5678-CM", 50, "Toyota Coaster");
        agence.ajouterBus(bus1);
        agence.ajouterBus(bus2);

        // 3. Créer des lignes
        Ligne ligne1 = new Ligne(1, "L01", "Ngaoundéré", "Yaoundé", 8000, 350, "06:00");
        Ligne ligne2 = new Ligne(2, "L02", "Ngaoundéré", "Garoua",  3500, 150, "08:00");
        Ligne ligne3 = new Ligne(3, "L03", "Ngaoundéré", "Douala",  10000, 500, "05:00");
        agence.ajouterLigne(ligne1);
        agence.ajouterLigne(ligne2);
        agence.ajouterLigne(ligne3);

        System.out.println("=== LIGNES DISPONIBLES ===");
        for (Ligne l : agence.getLignes()) {
            l.afficherInfo();
        }
        System.out.println();

        // 4. Créer un client et acheter des tickets
        Client client = new Client(
            1, "SALMADA", "Ebenezer Kla",
            "ebenezer@email.cm", "pass123", "+237 690 00 00 01"
        );

        System.out.println("=== ACHAT DE TICKETS EN LIGNE ===");
        client.acheterTicket(ligne1, "15/06/2025");
        client.acheterTicket(ligne2, "20/06/2025");
        System.out.println();

        // 5. Afficher les tickets du client
        client.afficherMesTickets();
    }
}
