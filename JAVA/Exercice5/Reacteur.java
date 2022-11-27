package Exercice5;

public class Reacteur {
    private String marque;
    private double poids;
    private double poussee;

    public Reacteur(String marque, double poids, double poussee){
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