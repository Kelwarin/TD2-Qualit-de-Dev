package Banque;

public class Visa implements Modele{
    public Carte attribuerCarteCredit(Client client){
        return new CarteCredit("Visa");
    }
    public Carte attribuerCarteDebit(Client client){
        return new CarteDebit("Visa");
    }
}
