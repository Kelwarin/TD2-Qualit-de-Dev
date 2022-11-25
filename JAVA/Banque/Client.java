package Banque;

import java.util.ArrayList;

public class Client {
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private Banque banque;
    private boolean droitCredit;
    private ArrayList<Carte> cartes;

    public Client(int idClient, String nomClient, String prenomClient, Banque banque, boolean droitCredit) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.banque = banque;
        this.droitCredit = droitCredit;
        this.cartes = new ArrayList<>();
    }

    public void demanderPaiement(){
        cartes.add(banque.attribuerCarte(this));
    }

    public boolean isDroitCredit() {
        return droitCredit;
    }
}
