package Exercice5;

import java.util.ArrayList;

public class UsineBoeing extends Usine {
    public Avion fabriqueAvion(String modele, String marqueReacteur){
        AvionBoeing avion = new AvionBoeing(modele, marqueReacteur);
        avion.setImmatriculation(Immatriculation.getInstance().immatriculer());
        return avion;
    }

    public Satellite fabriqueSatellite(String modele){
        return new SatelliteSpatiale(modele);
    }
}