package Exercice5;

import java.util.ArrayList;
import java.util.Collections;

public class Avion {
    protected String marque;
    protected String modele;
    protected ArrayList<Reacteur> reacteurs;
    protected Fuselage fuselage;
    protected String immatriculation;
    protected String marqueReacteur;

    public Avion(String modele, String marqueReacteur) {
        this.marque = modele;
        this.marqueReacteur = marqueReacteur;
    }

    @Override
    public String toString() {
        String str = modele + " de marque " + marque + " immatriculé " + immatriculation + "\n" +
                fuselage + "\n" + reacteurs.size() + " Reacteurs :\n";
        ArrayList<Reacteur> vu = new ArrayList<>();
        for(Reacteur reacteur : reacteurs){
            if(!vu.contains(reacteur)) {
                int i = Collections.frequency(reacteurs, reacteur);
                str += "  - " + i + " " + reacteur + "\n";
                vu.add(reacteur);
            }
        }
        return str;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setReacteurs(ArrayList<Reacteur> reacteurs) {
        this.reacteurs = reacteurs;
    }

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public String getMarqueReacteur() {
        return marqueReacteur;
    }
}