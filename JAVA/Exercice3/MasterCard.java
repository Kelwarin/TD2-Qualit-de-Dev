package Exercice3;

public class MasterCard implements Modele{
    public Carte attribuerCarteCredit(Client client){
        return new CarteCredit("MasterCard");
    }
    public Carte attribuerCarteDebit(Client client){
        return new CarteDebit("MasterCard");
    }
}
