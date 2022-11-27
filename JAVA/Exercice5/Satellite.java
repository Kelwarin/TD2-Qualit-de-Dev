package Exercice5;

public abstract class Satellite {
    protected String marque;
    protected String modele;
    protected String type;

    public Satellite(String marque, String modele, String type) {
        this.marque = marque;
        this.modele = modele;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Satellite " + type + " " + modele + " de marque " + marque;
    }
}