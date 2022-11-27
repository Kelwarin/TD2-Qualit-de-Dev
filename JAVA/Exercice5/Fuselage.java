package Exercice5;

public class Fuselage {
    private double poids;
    private int capacite;

    public Fuselage(double poids, int capacite) {
        this.poids = poids;
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Fuselage :\n" +
                "  - poids : " + poids + " tonnes\n" +
                "  - capacite : " + capacite + " personnes";
    }
}