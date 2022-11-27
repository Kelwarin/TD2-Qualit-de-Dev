package Exercice5;

import java.util.ArrayList;

public class AvionAirbus extends Avion {
    public AvionAirbus(String modele, ArrayList<Reacteur> reacteurs, Fuselage fuselage) {
        super("Airbus", modele, reacteurs, fuselage);
    }
}