package Banque;

public class Banque {
    private String nomBanque;
    public Banque(String nomBanque){
        this.nomBanque = nomBanque;
    }

    public static Carte attribuerCarte(Client client){
        if(client.isDroitCredit()){
            return new CarteCredit();
        }
        else{
            return new CarteDebit();
        }
    }

    public static Carte attribuerCarteCredit(Client client, Modele modele){
        return modele.attribuerCarteCredit(client);
    }
    public static Carte attribuerCarteDebit(Client client, Modele modele){
        return modele.attribuerCarteDebit(client);
    }

    public static void main(String[] args) {
        Banque creditAgricole = new Banque("Credit Agricole");
        Client client = new Client(01, "VIVIERS", "Mathis", creditAgricole, true);
        attribuerCarteCredit(client, new MasterCard());
        Client client2 = new Client(01, "VIVIERS", "Nathan", creditAgricole, true);
        attribuerCarteDebit(client2, new Visa());
    }
}
