package Exercice5;

import java.util.ArrayList;

public class UsineBoeing extends Usine {
    public Avion fabriqueAvion(String modele, ArrayList<Reacteur> reacteurs, Fuselage fuselage){
        return new AvionBoeing(modele, reacteurs, fuselage);
    }

    public Satellite fabriqueSatellite(String modele){
        return new SatelliteSpatiale(modele);
    }
}
