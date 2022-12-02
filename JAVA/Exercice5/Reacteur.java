package Exercice5;

public class Reacteur {
    private String marque;
    private int poids;
    private int poussee;

    public Reacteur(String marque, int poids, int poussee){
        this.marque = marque;
        this.poids = poids;
        this.poussee = poussee;
    }

    @Override
    public String toString() {
        return marque + " :\n" +
                "      ▪ poids : " + poids + " tonnes\n" +
                "      ▪ poussee : mach " + poussee;
    }
}