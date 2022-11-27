package Exercice5;

import java.util.ArrayList;

public class UsineAirbus extends Usine {
    public Avion fabriqueAvion(String modele, ArrayList<Reacteur> reacteurs, Fuselage fuselage){
        return new AvionAirbus(modele, reacteurs, fuselage);
    }

    public Satellite fabriqueSatellite(String modele){
        return new SatelliteTerrestre(modele);
    }
}
