package Exercice3;

public class CarteDebit extends Carte{
    public CarteDebit(){
        this.type = "debit";
    }

    public CarteDebit(String modele){
        this.type = "debit";
        this.modele = modele;
    }
}
