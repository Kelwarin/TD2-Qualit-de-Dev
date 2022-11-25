package Exercice3;

public class CarteCredit extends Carte{
    public CarteCredit(){
        this.type = "credit";
    }

    public CarteCredit(String modele){
        this.type = "credit";
        this.modele = modele;
    }
}
