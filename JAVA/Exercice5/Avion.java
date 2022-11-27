package Exercice5;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Avion {
    protected String marque;
    protected String modele;
    protected ArrayList<Reacteur> reacteurs;
    protected Fuselage fuselage;
    protected String immatriculation;

    public Avion(String marque, String modele, ArrayList<Reacteur> reacteurs, Fuselage fuselage) {
        this.marque = marque;
        this.modele = modele;
        this.reacteurs = reacteurs;
        this.fuselage = fuselage;
        this.immatriculation = Immatriculation.getInstance().immatriculer();
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
}