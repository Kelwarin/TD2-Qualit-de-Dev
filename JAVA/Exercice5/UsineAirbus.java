package Exercice5;

import java.util.ArrayList;

public class UsineAirbus extends Usine {
    public Avion fabriqueAvion(String modele, String marqueReacteur){
        AvionAirbus avion = new AvionAirbus(modele, marqueReacteur);
        avion.setImmatriculation(Immatriculation.getInstance().immatriculer());
        return avion;
    }

    public Satellite fabriqueSatellite(String modele){
        return new SatelliteTerrestre(modele);
    }
}